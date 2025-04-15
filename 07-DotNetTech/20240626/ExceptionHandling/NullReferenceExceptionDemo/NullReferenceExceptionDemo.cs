using System.Text;

namespace NullReferenceExceptionDemo
{
    class BankAccount
    {
        public string? AccountHolderName { get; set; }
        public int AccountNumber { get; set; }
        public double CurrentBalance { get; set; }
    }
    class FundsTransfer
    {
        public void MoneyTransfer(BankAccount sourceAccount, BankAccount destinationAccount, double Amount)
        {
            try
            {
                sourceAccount.CurrentBalance -= Amount;   // debit 
                destinationAccount.CurrentBalance += Amount; // credit
            }
            catch (NullReferenceException)
            {
                Console.WriteLine("Destination Account Have Some Error Or Does Not Exist! ❌");
                throw; // It throws the same object of NullReferenceException to the calling() method
            }
        }
    }
    internal class NullReferenceExceptionDemo
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            try
            {
                BankAccount RohanAccount = new() { AccountHolderName = "Rohan", AccountNumber = 101, CurrentBalance = 5000 };
                BankAccount MohanAccount = new() { AccountHolderName = "Mohan", AccountNumber = 102, CurrentBalance = 6000 };
                BankAccount SohanAccount = new() { AccountHolderName = "Sohan", AccountNumber = 103, CurrentBalance = 7000 };
                BankAccount DonaldAccount = null;   // Simulates NullReferenceException

                FundsTransfer fundsTransfer = new();
                fundsTransfer.MoneyTransfer(RohanAccount, DonaldAccount, 12000);
                Console.WriteLine("Fund Transfered Successfully ✅");
            }
            catch (NullReferenceException ex)
            {
                Console.WriteLine($"Exception Message : {ex.Message}");
            }

            Console.ReadKey();
        }
    }
}

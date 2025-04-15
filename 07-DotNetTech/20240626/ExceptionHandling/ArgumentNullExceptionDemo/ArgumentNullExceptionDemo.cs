using System.Text;

namespace ArgumentNullExceptionDemo
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
            }
            catch (NullReferenceException ex)
            {
                // Throwing ArgumentNullException (since the BankAccount Objects are null)
                throw new ArgumentNullException("sourceAccount", " ➖ Failed, You have supplied null value to source account as a argument ❌");
            }
            try
            {
                destinationAccount.CurrentBalance += Amount; // credit
            }
            catch (NullReferenceException ex)
            {
                // Throwing ArgumentNullException (since the BankAccount Objects are null)
                throw new ArgumentNullException("destinationAccount", " ➕ Failed, You have supplied null value to destination account as a argument ❌");
            }
        }
    }
    internal class ArgumentNullExceptionDemo
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            try
            {
                BankAccount RohanAccount = new() { AccountHolderName = "Rohan", AccountNumber = 101, CurrentBalance = 5000 };
                BankAccount DonaldAccount = null; // Providing Null Value to Donald's Account

                FundsTransfer fundsTransfer = new FundsTransfer();
                fundsTransfer.MoneyTransfer(RohanAccount, DonaldAccount, 2000);
                Console.WriteLine("Fund Transfer Successfully. ✅");
            }
            catch (ArgumentNullException ex)
            {
                Console.WriteLine(ex.Message);  // We are Catching ArgumentNullException Here
            }
            Console.ReadKey();
        }
    }
}

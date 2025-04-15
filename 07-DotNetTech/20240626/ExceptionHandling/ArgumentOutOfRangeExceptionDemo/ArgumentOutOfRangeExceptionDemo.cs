using System.Text;

namespace ArgumentOutOfRangeExceptionDemo
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
                if (Amount < 0 || Amount > sourceAccount.CurrentBalance)
                {
                    //////////////////////////////////////////////////////////
                    ///Throwing ArgumentOutOfRangeException //////////////////
                    throw new ArgumentOutOfRangeException("Amount", sourceAccount.CurrentBalance, "Amount is Exceeded the Limit or Less Than 0");
                }
                sourceAccount.CurrentBalance -= Amount;   // debit 
            }
            catch (NullReferenceException ex)
            {

                throw new ArgumentNullException("sourceAccount", "You have supplied null value to sourceAccount as argument");
            }
            try
            {

                destinationAccount.CurrentBalance += Amount; // credit
            }
            catch (NullReferenceException ex)
            {

                throw new ArgumentNullException("destinationAccount", "You have supplied null value to destination account as a argument");
            }
        }
    }
    internal class ArgumentOutOfRangeExceptionDemo
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            try
            {
                BankAccount RohanAccount = new() { AccountHolderName = "Rohan", AccountNumber = 101, CurrentBalance = 5000 };
                BankAccount MohanAccount = new() { AccountHolderName = "Mohan", AccountNumber = 102, CurrentBalance = 6000 };
                BankAccount DolandAccount = null;

                FundsTransfer fundsTransfer = new FundsTransfer();
                fundsTransfer.MoneyTransfer(RohanAccount, DolandAccount, 1000);
                Console.WriteLine("Fund Transfer Successfully. ✅");
            }
            catch (ArgumentNullException ex)
            {
                Console.WriteLine(ex.Message);
            }

            catch (ArgumentOutOfRangeException ex) // Catches ArgumentOutOfRangeException, thrown by the moneytransfer() method
            {
                Console.WriteLine(ex.Message);  // This will Write the message passed
                Console.WriteLine(ex.ActualValue); // Prints the ActualValue passsed where it is thrown
                Console.WriteLine(ex.ParamName); // Prints the Parameter passsed where it is thrown
            }

            Console.ReadKey();
        }
    }
}
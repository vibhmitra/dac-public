using System.Text;

namespace InvalidOperationExceptionDemo
{
    class BankAccount
    {
        public string? AccountHolderName { get; set; }
        public int AccountNumber { get; set; }

        private double _currentBalance;
        public double CurrentBalance
        {
            get => _currentBalance;
            set
            {
                if (value < 0)
                {
                    throw new ArgumentOutOfRangeException($"The Value of Current balance Should Be Positive, You Have to Provided: {value}, Current Balance");
                }
                _currentBalance = value;
            }
        }
    }
    class FundsTransfer
    {
        public void MoneyTransfer(BankAccount sourceAccount, BankAccount destinationAccount, double Amount)

        {
            // ON DEBIT
            try
            {
                if (Amount < 0 || Amount > 10000)
                {
                    //ArgumentOutOfRangeException aor = new();
                    // Using 'throw' keyword we can Specify that what type of Exception we want to make.
                    throw new ArgumentOutOfRangeException("Amount", sourceAccount.CurrentBalance, "Amount must be between 1 - 10000 $");
                }
                if (Amount > sourceAccount.CurrentBalance)
                {
                    throw new InvalidOperationException($"Insufficient Funds in the Source Account, The Current Balance : {sourceAccount.CurrentBalance} but you are trying to transfer {Amount}");
                }
                sourceAccount.CurrentBalance -= Amount;   // debit 
            }
            catch (NullReferenceException ex)
            {

                throw new ArgumentNullException("sourceAccount", "You have supplied null value to source account as argument");
            }

            // ON CREDIT
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
    internal class InvalidOperationDemo
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
                fundsTransfer.MoneyTransfer(RohanAccount, SohanAccount, -1000); // Simulates InvalidOperationException
                Console.WriteLine("Fund Transfered Successfully ✅");


            }
            catch (ArgumentNullException ex)
            {
                Console.WriteLine("ArgumentNullException");
                Console.WriteLine(ex.Message);
            }

            catch (ArgumentOutOfRangeException ex) // It catches the ArgumentOutOfRangeException, thrown by the MoneyTransfer() method
            {
                Console.WriteLine("ArgumentOutOfRangeException");
                Console.WriteLine($"{ex.Message}\n");
                Console.WriteLine($"Parameter Name : {ex.ParamName}");
                Console.WriteLine($"Actual Value Provided : {ex.ActualValue}");
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine($"Invalid Operation : \n{ex.Message}");
            }
            Console.ReadKey();
        }
    }
}

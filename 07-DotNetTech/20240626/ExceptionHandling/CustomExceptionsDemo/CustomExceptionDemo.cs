namespace CustomExceptionsDemo
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
                    throw new ArgumentOutOfRangeException($"The Value of Current Balance Should Be Positive, You Have to Provided: {value} as Current Balance");
                }
                _currentBalance = value;
            }
        }
    } // Bank Account Class Ends Here

    // Custom or User Defined Exception Class **********************/
    class InsufficientFundsException : InvalidOperationException
    {
        public InsufficientFundsException() { } // Default Constructor
        public InsufficientFundsException(string message) : base(message) { }
        public InsufficientFundsException(string message, Exception innerException) : base(message, innerException) { }
    }
    class FundsTransfer
    {
        public void MoneyTransfer(BankAccount sourceAccount, BankAccount destinationAccount, double Amount)

        {
            try
            {
                if (Amount < 0 || Amount > 10000)
                {
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
                throw new ArgumentNullException("sourceAccount", "You Have Supplied Null value to sourceAccount As Argument");
            }
            try
            {
                destinationAccount.CurrentBalance += Amount; // credit
            }
            catch (NullReferenceException ex)
            {
                throw new ArgumentNullException("destinationAccount", "You Have Supplied Null value to destinationAccount As Argument");
            }
        }
    } // FundsTransfer Class Ends Here


    // Exception Logger | This is Just to Store it in a Log File
    class ExceptionLogger
    {
        // we are using parent exception as argument to get access to all exception
        public static void ReportException(Exception ex)
        {
            string filePath = @"../../../CustomErrorLogReport.txt";
            StreamWriter streamWriter = File.AppendText(filePath);
            streamWriter.WriteLine(":::::: LOG GENERATED ::::::");
            streamWriter.WriteLine("\nSystem Time : " + DateTime.Now);
            streamWriter.WriteLine("Exception Type : " + ex.GetType().ToString());
            streamWriter.WriteLine("\nStack Traces : " + ex.StackTrace);
            streamWriter.WriteLine("\nMessage : " + ex.Message + "\n");
            streamWriter.Close();
        }
    } // Logger Class Ends Here

    internal class CustomExceptionDemo
    {
        static void Main(string[] args)
        {
            try
            {
                BankAccount RohanAccount = new() { AccountHolderName = "Rohan", AccountNumber = 101, CurrentBalance = 5000 };
                BankAccount SohanAccount = new() { AccountHolderName = "Sohan", AccountNumber = 102, CurrentBalance = 6000 };
                BankAccount DolandAccount = null;

                FundsTransfer fundsTransfer = new FundsTransfer();
                fundsTransfer.MoneyTransfer(RohanAccount, SohanAccount, 10000);
                Console.WriteLine("Fund Transfer Successfully!");
            }
            catch (ArgumentNullException ex)
            {
                Console.WriteLine(ex.Message);
                ExceptionLogger.ReportException(ex); // :p Logger
            }

            catch (ArgumentOutOfRangeException ex)
            {
                Console.WriteLine(ex.Message);
                Console.WriteLine(ex.ActualValue);
                Console.WriteLine(ex.ParamName);
                ExceptionLogger.ReportException(ex); // :p Logger
            }
            catch (InsufficientFundsException ex)
            {
                Console.WriteLine(ex.Message);
                ExceptionLogger.ReportException(ex); // :p Logger
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine(ex.Message);
                ExceptionLogger.ReportException(ex); // :p Logger
            }

            Console.ReadKey();
        }
    }
}

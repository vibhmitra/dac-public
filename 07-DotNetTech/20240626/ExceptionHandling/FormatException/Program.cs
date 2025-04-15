using System.Text;

namespace FormatExceptionDemo
{
    class BankAccount
    {
        public int AccountNumber { get; set; }
        public string? AccountHolderName { get; set; }
        public double CurrentBalance { get; set; }
    }


    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            // Create Objedct for Bank Account Class
            BankAccount bankAccount = new BankAccount();
            try
            {

                // Take Input From the user
                Console.Write("👉 Holders Name? > ");
                bankAccount.AccountHolderName = Console.ReadLine();

                Console.Write("👉 Account Number? > ");
                bankAccount.AccountNumber = int.Parse(Console.ReadLine());

                Console.Write("👉 Current? > ");
                bankAccount.CurrentBalance = double.Parse(Console.ReadLine());

                Console.WriteLine("\n✨ New Bank Account Details ✨");
                Console.WriteLine($"Holders Name : {bankAccount.AccountNumber}");
                Console.WriteLine($"Account Number: {bankAccount.AccountHolderName}");
                Console.WriteLine($"Current Balance : {bankAccount.CurrentBalance}");
            }
            catch (FormatException e)
            {
                Console.WriteLine("Input Must Be Numerical Damn! 🙄");
                Console.WriteLine($"Exception Message: {e.Message}");
            }
        }
    }
}

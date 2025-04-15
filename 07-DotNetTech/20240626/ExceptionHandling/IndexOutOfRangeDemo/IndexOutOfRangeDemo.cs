using System.Text;

namespace IndexOutOfRangeDemo
{
    class BankAccount
    {
        public int AccountNumber { get; set; }
        public string? AccountHolderName { get; set; }
        public double CurrentBalance { get; set; }
    }

    internal class IndexOutOfRangeDemo
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            try
            {
                // Create Objedct for Bank Account Class
                BankAccount[] bankAccount = new BankAccount[]
                {
                   new BankAccount() { AccountHolderName = "Ruby", AccountNumber = 1000101, CurrentBalance = 85498.44 },
                   new BankAccount() { AccountHolderName = "Mill", AccountNumber = 1000102 , CurrentBalance = 543498.44 },
                   new BankAccount() { AccountHolderName = "Max", AccountNumber = 1000103 , CurrentBalance = 85498.44 }
                };

                for (int i = 0; i < bankAccount.Length; i++)
                {
                    Console.WriteLine($"A/C No : {bankAccount[i].AccountNumber}, Name : {bankAccount[i].AccountHolderName},\t💵 : {bankAccount[i].CurrentBalance}");
                }

                Console.Write("\n👉 Enter Serial Number to Fetch Details ? ");
                int serialNumber = int.Parse(Console.ReadLine());
                serialNumber--;
                if (serialNumber < 0 || bankAccount.Length <= serialNumber)
                {
                    Console.WriteLine("Invalid Serial Number 😐");
                }
                else
                {
                    //serialNumber = 8; 👈 Simulating IndexOutOfRangeException
                    BankAccount[] ba = new BankAccount[serialNumber];
                    Console.WriteLine($"A/C No : {bankAccount[serialNumber].AccountNumber}, Name : {bankAccount[serialNumber].AccountHolderName},\t💵 : {bankAccount[serialNumber].CurrentBalance}");
                }
            }
            catch (IndexOutOfRangeException e)
            {
                Console.WriteLine("Index Outta Range Damn! 😫");
            }
            catch (FormatException e)
            {
                Console.WriteLine("Bro Enter Numerical Number! 🤡");
            }
        }
    }
}

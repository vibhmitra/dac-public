using System.Text;

namespace DictionaryCollection
{
    public class Customer
    {
        public int Id { get; set; }
        public string? Name { get; set; }
        public double Salary { get; set; }

        public override string ToString()
        {
            return ($"ID : {this.Id}, Name : {this.Name}, Salary : {this.Salary}");
        }
    }


    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            // Create a Dictionary, Customer ID is the Key

            Dictionary<int, Customer> dic = new Dictionary<int, Customer>();

            // Creating Object for 'Customer' class
            Customer customer1 = new Customer() { Id = 101, Name = "Ren", Salary = 7859.90 };
            Customer customer2 = new Customer() { Id = 102, Name = "Zee", Salary = 1066.30 };
            Customer customer3 = new Customer() { Id = 103, Name = "Mei", Salary = 5009.45 };
            Customer customer4 = new Customer() { Id = 104, Name = "Rei", Salary = 2449.57 };

            // Add Customer to Dictionary
            dic.Add(customer1.Id, customer1);
            dic.Add(customer2.Id, customer2);
            dic.Add(customer3.Id, customer3);
            dic.Add(customer4.Id, customer4);

            // Retrival from Dictionary
            // using key which is nothing but Customer 'Id'
            Console.WriteLine("Print 102");
            Customer customer102 = dic[102];   // 101 is key here
            Console.Write(customer102.ToString());

            // Only Print Key
            Console.WriteLine("\n✨✨✨ Print Key from 📔 ✨✨✨");
            foreach (int key in dic.Keys)
            {
                Console.WriteLine("🔑 = " + key);
            }

            // Only Print Values
            Console.WriteLine("\n✨✨✨ Print Values from 📔 ✨✨✨");
            foreach (Customer c in dic.Values)
            {
                Console.WriteLine("🗂️ 👉 " + c);
            }
        }
    }
}

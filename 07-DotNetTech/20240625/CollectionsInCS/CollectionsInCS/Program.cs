using System.Text;

namespace CollectionsInCS
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

            // Creating Object for 'Customer' class
            Customer customer1 = new Customer() { Id = 101, Name = "Ren", Salary = 7859.90 };
            Customer customer2 = new Customer() { Id = 102, Name = "Zee", Salary = 1066.30 };
            Customer customer3 = new Customer() { Id = 103, Name = "Mei", Salary = 5009.45 };
            Customer customer4 = new Customer() { Id = 104, Name = "Rei", Salary = 2449.57 };

            Customer[] arrayCustomer = new Customer[2];
            arrayCustomer[0] = customer1;
            arrayCustomer[1] = customer2;
            //arrayCustomer[2] = customer3; // throw an error @ runtime

            List<Customer> listCustomers = new List<Customer>(2);   // In List Size can be added afterwards
            // To add Element in list use 'Add' method
            listCustomers.Add(customer1);
            listCustomers.Add(customer2);
            listCustomers.Add(customer3);

            // Items Retrieval from the List
            Customer c = listCustomers[0];
            Console.WriteLine($"ID : {c.Id}, Name : {c.Name}, Salary : {c.Salary}");

            // Using Normal Loop
            Console.WriteLine("\n< Retrieval From List >");
            for (int i = 0; i < listCustomers.Count; i++)
            {
                Console.WriteLine($"ID : {listCustomers[i].Id}, Name : {listCustomers[i].Name}, Salary : {listCustomers[i].Salary}");
            }

            Console.WriteLine("....................................");

            // Pinting Using foreach loop
            foreach (Customer cs in listCustomers)
            {
                Console.WriteLine($"ID : {cs.Id}, Name : {cs.Name}, Salary : {cs.Salary}");
            }
            /**
             * All the Generic Collection classes including List are empty are strongly
             * Typed. This means if you have created a list of customer type then it will
             * Only accept customer type objects
             */

            // adding at starting of the list is EASYYY
            listCustomers.Insert(0, customer4);
            Console.WriteLine($"New Data Inserted >> {customer4.ToString()}");

            // To get index Position of any Customer Type data
            Console.WriteLine("Index of Customer 2 : " + listCustomers.IndexOf(customer2));

            //
            Customer[] arrayCustomer2 = new Customer[4];
            arrayCustomer2[0] = customer1;
            arrayCustomer2[1] = customer2;
            arrayCustomer2[2] = customer3;
            arrayCustomer2[3] = customer4;

            // Covert An Array to List Using ToList() Method
            Console.WriteLine("\n**** Covert An Array to List Using ToList() Method ****");
            List<Customer> listCustomer2 = arrayCustomer2.ToList();
            foreach (Customer cs in listCustomer2)
            {
                Console.WriteLine($"ID : {cs.Id}, Name : {cs.Name}, Salary : {cs.Salary}");
            }

            // Conver List to Array
            Console.WriteLine("\n**** Conver List to Array: ****");
            Customer[] customerArray = listCustomer2.ToArray();
            foreach (Customer cs in customerArray)
            {
                Console.WriteLine($"ID : {cs.Id}, Name : {cs.Name}, Salary : {cs.Salary}");
            }

            // To Covert a List -> Dictionary
            Console.WriteLine("\n**** To Covert a List -> Dictionary ****");
            Dictionary<int, Customer> dictionary = listCustomer2.ToDictionary(x => x.Id);
            foreach (KeyValuePair<int, Customer> keyValuePair in dictionary)
            {
                Console.WriteLine($"Key= {keyValuePair.Key}, Value = [{keyValuePair.Value}]");
            }

            // Contains Method
            Console.WriteLine("\n**** To Check if Data Available in the List ****");
            if (listCustomer2.Contains(customer1))
            {
                Console.WriteLine("Customer 2 Does Exist! ✅");
            }
            else
            {
                Console.WriteLine("Customer 2 Does Not Exist! ❌");
            }


            // Contains Method
            Console.WriteLine("\n**** Find Method ****");
            c = listCustomer2.Find(customer => customer.Name == "Mei");
            Console.WriteLine(c.ToString());

            Console.ReadKey();
        }
    }
}
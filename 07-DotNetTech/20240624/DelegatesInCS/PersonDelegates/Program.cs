using System.Text;

namespace PersonDelegates
{
    // Delegates can Work as parameter for other methods

    public class Person
    {
        public String? Name { get; set; }
        public int Age { get; set; }
    }

    internal class Program
    {
        // Declaration
        public delegate bool filterDelegate(Person person);


        public static void displayPerson(string title, List<Person> persons, filterDelegate filter)
        {

            foreach (Person person in persons)
            {
                if (filter(person))
                {
                    Console.Write(title);
                    Console.WriteLine("{0} is {1} Years Old. ", person.Name, person.Age);
                }
            }
        }

        // Target Method
        public static bool isChild(Person person) => (person.Age < 18);
        public static bool isAdult(Person person) => (person.Age >= 18 && person.Age < 60);
        public static bool isSenior(Person person) => (person.Age >= 60);


        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            Console.WriteLine("Hello, World!");
            // Create objects for 5 Persons
            Person p1 = new() { Name = "Abby", Age = 20 };
            Person p2 = new() { Name = "Bob", Age = 18 };
            Person p3 = new() { Name = "Caesy", Age = 25 };
            Person p4 = new() { Name = "Devin", Age = 65 };
            Person p5 = new() { Name = "Eve", Age = 17 };

            // Create A List of 'Person' Objects
            List<Person> persons = new List<Person>() { p1, p2, p3, p4, p5 };

            // Invoking Display Person Using Appropriate Delegates
            displayPerson("👶 Children > ", persons, isChild);
            displayPerson("👨‍🦰 Adult > ", persons, isAdult);
            displayPerson("👨‍🦳 Senior > ", persons, isSenior);

            Console.ReadKey();
        }
    }
}

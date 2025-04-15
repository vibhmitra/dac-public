namespace LINQInCS
{
    class Employee
    {
        public int EmpId { get; set; }
        public string? EmpName { get; set; }
        public string? Job { get; set; }
        public double Salary { get; set; }

        public override string? ToString()
        {
            return ($"ID : {this.EmpId}, Name : {this.EmpName}, Job Role : {this.Job}, Salary : {this.Salary}");
        }
    }

    class Person
    {
        public string? Name { get; set; }

        public override string? ToString()
        {
            return ($"{this.Name}");
        }
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            List<Employee> empList = new List<Employee>()
            {
                new Employee {EmpId = 1, EmpName = "Henry", Job = "Manager", Salary = 7895.67 },
                new Employee {EmpId = 2, EmpName = "Rob", Job = "Developer", Salary = 6895.67 },
                new Employee {EmpId = 3, EmpName = "John", Job = "Engineer", Salary = 595.67 },
                new Employee {EmpId = 4, EmpName = "Randy", Job = "Clerk", Salary = 4895.67 },
                new Employee {EmpId = 5, EmpName = "Max", Job = "Manager", Salary = 9895.67 }
            };

            // Element At
            Employee emp1 = empList.Where(e => e.Job == "Manager").ElementAt(0);
            Console.WriteLine("Index 0 : " + emp1.Job);

            // Element AtOrDefault
            Console.WriteLine("\n**** Element At or Default *****");
            Employee emp2 = empList.Where(e => e.Job == "Sales").ElementAtOrDefault(1);
            if (emp2 != null)
            {
                Console.WriteLine(emp2.ToString());
            }
            else
            {
                Console.WriteLine("No Manager @ index 0, Damn!.");
            }

            Console.WriteLine("\n**** Person List *****");
            // using 'Select'
            List<Person> personList = empList.Select(e => new Person { Name = e.EmpName }).ToList();
            foreach (Person person in personList)
            {
                Console.WriteLine(person.Name);
            }

        }
    }
}

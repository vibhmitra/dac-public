namespace DelegateExampleFilter
{
    public class Employee
    {
        public int Id { get; set; }
        public string? Name { get; set; }
        public double Salary { get; set; }
        public int Experience { get; set; }
    }

    internal class Program
    {
        public delegate bool FilterDelegate(Employee e);

        public static void DisplayEmployee(List<Employee> empList, FilterDelegate filter)
        {
            Console.WriteLine("Employee with Approprite Experience:");
            foreach (Employee e in empList)
            {
                if (filter(e))
                {
                    Console.WriteLine($"{e.Id}, {e.Name}, {e.Experience}, {e.Salary} <PROMOTED>");
                }

            }
        }


        // Target Methods
        public static bool IsExperienced(Employee e)
        { return e.Experience > 5; }


        static void Main(string[] args)
        {
            List<Employee> empList = new List<Employee>();
            empList.Add(new Employee() { Id = 101, Name = "John", Salary = 400.00, Experience = 6 });
            empList.Add(new Employee() { Id = 102, Name = "Revy", Salary = 600.60, Experience = 8 });
            empList.Add(new Employee() { Id = 103, Name = "Envy", Salary = 800.00, Experience = 5 });
            empList.Add(new Employee() { Id = 104, Name = "Emma", Salary = 99.90, Experience = 2 });

            DisplayEmployee(empList, IsExperienced);

            Console.ReadKey();
        }
    }
}

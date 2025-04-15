namespace PredicateDelegate2
{
    public class Employee
    {
        private string _firstName;
        private string _lastName;
        private string _designation;

        public Employee(string firstName, string lastName, string designation)
        {
            FirstName = firstName;
            LastName = lastName;
            Designation = designation;
        }

        public string FirstName { get => _firstName; set => _firstName = value; }
        public string LastName { get => _lastName; set => _lastName = value; }
        public string Designation { get => _designation; set => _designation = value; }

        public static bool EmpSearch(Employee emp)
        {
            if (emp.FirstName == "Rohan")
            {
                return true;
            }
            else
            {
                return false;
            }

        }
        public Predicate<Employee> dlgt = Employee.EmpSearch;
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee employee1 = new Employee("Vikram", "Bhardwaj", "Project Engineer");
            Employee employee2 = new Employee("Pranjal", "Singh", "Engineer");
            Employee employee3 = new Employee("Manish", "Singh", "SDE-2");
            Employee employee4 = new Employee("Rohan", "Sethi", "Senior Project Engineer");

            List<Employee> list = new List<Employee>() { employee1, employee2, employee3, employee4 };
            Predicate<Employee> predicateDelicate = new Predicate<Employee>(Employee.EmpSearch);
            Employee emp = list.Find(predicateDelicate);
            Console.WriteLine("Employee Found! {0} {1}", emp.FirstName, emp.LastName);
            Console.ReadKey();
        }
    }
}
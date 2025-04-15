namespace EmployeeLINQExample
{
    class Employee
    {
        public int EmpId { get; set; }
        public string? Name { get; set; }
        public string? Job { get; set; }

        public string? City { get; set; }

        public double Salary { get; set; }

    }
    internal class Program
    {

        static void Main(string[] args)
        {
            List<Employee> empList = new List<Employee>()
            {
                new Employee() { EmpId=101, Name="William", Job="Manager", City="Delhi", Salary=7865},
                new Employee() { EmpId=102, Name="Henry", Job="Developer", City="US", Salary=4765},
                new Employee() { EmpId=103, Name="Kate", Job="Manager", City="New York", Salary=5897},
                new Employee() { EmpId=104, Name="Ron", Job="Developer", City="New York", Salary=6987}
            };

            var result = empList.Where(emp => emp.EmpId == 101);

            //IEnumerable<Employee> result2 =  empList.Where(emp => emp.City == "New York");

            // Where condition
            List<Employee> filteredEmployee = empList.Where(emp => emp.Job == "Developer").ToList();

            Console.WriteLine(filteredEmployee[0].EmpId + " " + filteredEmployee[0].Name);
            Console.WriteLine(filteredEmployee[1].EmpId + " " + filteredEmployee[1].Name);

            //////////////////////////////

            // First Extension method
            Console.WriteLine("\n*** First Extension Meths ***");
            Employee firstEmployeeFE = empList.First(emp => emp.Job == "Manager");
            //Employee firstEmployee = empList.First(emp => emp.Job == "Proj"); // this will throw exception
            Console.WriteLine($"ID: {firstEmployeeFE.EmpId}, Name: {firstEmployeeFE.Name}");

            // To overcome above problem we will now use 
            // FirstOrDefault shit here.
            Console.WriteLine("\n*** First Or Default Extension Meths ***");
            Employee firstEmployeeFoD = empList.FirstOrDefault(emp => emp.Job == "Project Engineer");
            if (firstEmployeeFoD != null)
            {
                Console.WriteLine($"ID: {firstEmployeeFoD.EmpId}, Name: {firstEmployeeFoD.Name}");
            }
            else
            {
                Console.WriteLine("Data Not Found!");
            }

            Console.WriteLine("\n*** Last Or Default Extension Meths ***");
            Employee LastEmployeeFoD = empList.LastOrDefault(emp => emp.City == "New York");
            if (LastEmployeeFoD != null)
            {
                Console.WriteLine($"ID: {LastEmployeeFoD.EmpId}, Name: {LastEmployeeFoD.Name}");
            }
            else
            {
                Console.WriteLine("Data Not Found!");
            }


            foreach (Employee emp in result)
            {
                Console.WriteLine("\n***");
                Console.WriteLine($"ID : {emp.EmpId}");
                Console.WriteLine($"Name : {emp.Name}");
                Console.WriteLine($"JobeRole : {emp.Job}");
                Console.WriteLine($"City : {emp.City}");
            }

            Console.ReadKey();
        }
    }
}

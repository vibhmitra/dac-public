using InheritanceClassLibrary;
using System.Text;

namespace InheritanceInCS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            // The Employee : the base class
            Employee employee = new Employee(101, "Mr. Employee", "Des Monies");
            Console.WriteLine("Parent Class (Employee) >");
            Console.WriteLine($"ID : {employee.empId}\nName: {employee.empName}\nLocation: {employee.empLocation}");
            Console.WriteLine(employee.getHealthInsuranceAmt());
            Console.WriteLine("〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰\n");

            // Manager : Employee
            Manager manager = new Manager(102, "Mr. Manager", "Iowa", "Sales");
            Console.WriteLine("Child Class (Manager) >");
            Console.WriteLine($"ID : {manager.empId}\nName: {manager.empName}\nLocation: {manager.empLocation}\nDepartemnt: {manager.departmentName}\nFull Department Name: {manager.getFullDepartmentName()}");
            Console.WriteLine(manager.getHealthInsuranceAmt());
            Console.WriteLine("〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰\n");

            // Salesman : Employee
            Salesman salesman = new Salesman(103, "Mr. Sales Man", "Yoki", "Norhtern");
            Console.WriteLine("Child Class (Salesman) >");
            Console.WriteLine($"ID : {salesman.empId}\nName: {salesman.empName}\nLocation: {salesman.empLocation}\nRegion : {salesman.Region}\n\n");
            Console.WriteLine(salesman.getHealthInsuranceAmt());
            Console.WriteLine("〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰\n");

            Console.ReadKey();
        }
    }
}

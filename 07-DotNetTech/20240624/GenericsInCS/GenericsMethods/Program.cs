namespace GenericsMethods
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            Test test = new Test();

            Employee employee = new Employee() { Salary = 7500 };
            Student student = new Student() { Marks = 67 };
            test.printData(employee);
            test.printData(student);
        }
    }
}

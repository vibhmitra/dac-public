using PartialClassLibrary;
namespace PartialClassInCS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Product p = new Product { ProductID = 101, Cost = 10 };
            p.GetTax();


            // The Below code has nothing to do with Partial Class Dah!
            Employee emp = new Employee();
            emp.EmpName = "Rohan";
            emp.email = "rohan@r.com";
            emp.agegroup = AgeGroupEnumeration.Senior;

            Console.WriteLine(emp.EmpName);
            Console.WriteLine(emp.email);
            Console.WriteLine(emp.agegroup);

            Console.ReadKey();
        }
    }
}

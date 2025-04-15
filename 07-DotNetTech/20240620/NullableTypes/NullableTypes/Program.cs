namespace NullableTypes
{
    public class Employee
    {
        public int? NoOfChildren;    // ? used for to print null if int 
        public int age;
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee emp1 = new Employee() { NoOfChildren = 2 };
            Employee emp2 = new Employee() { NoOfChildren = null };
            Employee emp3 = null;
            Console.WriteLine(emp1.NoOfChildren);

            // the long method
            if (emp2.NoOfChildren.HasValue)
            {
                int x = emp2.NoOfChildren.Value;
                Console.WriteLine(x);
            }

            // Null Coalescing operator
            // Console.WriteLine((emp2.NoOfChildren.HasValue)?emp2.NoOfChildren.Value:0); // used any one
            Console.WriteLine(emp2.NoOfChildren ?? 0);

            Employee emp4 = null;
            Employee emp5 = new() { age = 24 };


            Console.WriteLine((emp5 == null) ? null : Convert.ToString(emp5.NoOfChildren));
            Console.WriteLine((emp5?.age)); // usingn null propogation 
            Console.ReadKey();

        }
    }
}

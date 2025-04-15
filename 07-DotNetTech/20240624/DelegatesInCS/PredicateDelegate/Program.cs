using System.Text;
namespace PredicateDelegate
{
    // * Also a generic delegate, Is usefull to validate if input parameter
    //   meets the require or specific conditions or not.
    // * It is same as Func 
    // * The Predicate delegate takes only the method that take only one input parameter 
    //   and return the Boolean type value eithrt true or false.
    // * Action delegates to hold the reference of one or more method.
    // Syntax:
    //      public delegate bool Predicate<in T>(T agr);
    internal class Program
    {
        // target method
        /* public static bool IsAgeGreaterThan18(int age)
         {
             bool result = false;
             if (age > 18)
             {
                 result = true;
             }
             return result;
         }*/
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            // Decleration : this checks if input age is Valid or Not on Annonymous method
            Predicate<int> predicateDelegate = (age) => { return (age > 18); };

            bool result = predicateDelegate(25);

            Console.WriteLine(result ? ($"Age > 18? {result} ✅") : ($"Age > 18? {result} ❌"));
            Console.ReadKey();
        }
    }
}

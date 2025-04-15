// Pattern Matching and 'is' keyword
using System.Text;

namespace PatternMatching
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            Console.WriteLine("Hello, World!");

            ParentClass parentClass;

            // create object of ChildClass
            parentClass = new ChildClass(); // ✅  Parent Can Store Childs Object
            //ChildClass childClass = parentClass;  this is invalid we need to cast it. ❌ Child Can't Store Parents Object
            ChildClass childClass = (ChildClass)parentClass;

            parentClass.num1 = 1;
            //parentClass.num2 = 2; // Not Accessible (num2 of child)

            // Instead of using casting you can just use 'is' Keyword.
            if (parentClass is ChildClass cc)
            {
                Console.WriteLine(cc.num1);
                cc.num2 = 2;
                Console.WriteLine(cc.num2);
            }
            Console.ReadKey();
        }
    }
}

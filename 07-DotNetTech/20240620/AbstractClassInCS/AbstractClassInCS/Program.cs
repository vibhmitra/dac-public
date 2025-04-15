using AbstractClassLibrary;
using System.Text;
namespace AbstractClassInCS
{
    internal class Program
    {
        static void Main()
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            Console.WriteLine("Abstraction In C#!");

            // A a = new A(); // Also you can't create instance of Abstreact class i guess
            B b = new();    // simplified new() WOW 😲
            b.MethodA();
            b.MethodB();
            b.NormalMethod();
        }
    }
}

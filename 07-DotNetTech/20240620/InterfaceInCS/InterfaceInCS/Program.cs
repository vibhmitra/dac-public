using System.Text;

namespace InterfaceInCS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            Console.WriteLine("Learning About Interface!");
            Console.WriteLine($"In this example Inteface IShape Contains \n" +
                               "One Property and One Method, The other two\n" +
                               "Classes 'Circle' and 'Square' are Implementing Interface");
            Square square = new(3.3);
            Circle circle = new(12.2);
            square.Draw();
            circle.Draw();
        }
    }
}

// Indexers allow instances of a class or struct to be indexed just like arrays.
using IndexerClassLibrary;

namespace IndexersInCS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // creating instance object of Color class
            Colors colors = new Colors();

            // calling get Accesser | indexed just like array yeah!
            Console.WriteLine(colors[0]);
            Console.WriteLine(colors[1]);
            Console.WriteLine(colors[2]);

            colors[0] = "Magenta";  // modifying values
            colors[1] = "Cyan";  // modifying values
            colors[2] = "Ello";  // modifying values
            Console.WriteLine(colors[0]);
            Console.WriteLine(colors[1]);
            Console.WriteLine(colors[2]);

            Console.ReadKey();
        }
    }
}

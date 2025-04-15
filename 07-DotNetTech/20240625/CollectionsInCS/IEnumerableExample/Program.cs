using System.Text;

namespace IEnumerableExample
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            // Its in System.Collections.Generics

            // Create A  Collection
            IEnumerable<string> list = new List<string>() { "ACTS", "CDAC", "Delho" };
            Console.WriteLine("\nUsing Enumerable");
            foreach (string item in list)
            {
                Console.WriteLine("👉 " + item);
            }

            // Using IEnumerator
            Console.WriteLine("\nUsing Enumerator");
            IEnumerator<string> enumerator = list.GetEnumerator();
            enumerator.Reset();
            while (enumerator.MoveNext())
            {
                Console.WriteLine("👉 " + enumerator.Current);  // ACTS
            }

            Console.ReadKey();
        }
    }
}

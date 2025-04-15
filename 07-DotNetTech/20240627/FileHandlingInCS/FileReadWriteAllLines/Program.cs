using System.Text;

namespace FileReadWriteAllLines
{   // WriteAllLines() Method
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            string filePath = @"../../../../data/FileReadWriteAllLines/demofile.txt";

            // String Array
            string[] lineContentt = { "Car", "Trains", "Boats", "Ships", "Rocket" };

            // List or Generic Type
            List<String> lines = new List<String>() { "Car", "Trains", "Boats", "Ships", "Rocket" };

            Console.WriteLine("Attempting To Write ...");
            File.WriteAllLines(filePath, lines);
            Console.WriteLine("File Written Successfully! ✅");

            // Reading From File
            Console.WriteLine("\nAttempting To Read Lines From File ...");
            foreach (String line in File.ReadAllLines(filePath))
            {
                Console.WriteLine(line);
            }
            Console.WriteLine("\n--- EOF 😀👍 ---");
            Console.ReadKey();
        }
    }
}

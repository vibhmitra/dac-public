using System.Text;
using System.Text.Unicode;

namespace FileReadWriteOperation
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            string filePath = @"../../../../data/FileReadWriteOperation/demofile.txt";
            string contents = "Hello! This is File Handling in C# 😏";

            // Writing data to file | This will also creates the file if it doesn't exist.
            Console.WriteLine("Attempting To Write Data Into The File 📝 ...");
            File.WriteAllText(filePath, contents, Encoding.UTF8);
            Console.WriteLine("Data Written Successfully! ✅");

            // Reading data from file
            Console.WriteLine("Attempting To Read Data From The File 🧐 ...");
            string data = File.ReadAllText(filePath, Encoding.UTF8);
            Console.WriteLine($"File Data :\n\t{data}");
            Console.ReadKey();
        }
    }
}

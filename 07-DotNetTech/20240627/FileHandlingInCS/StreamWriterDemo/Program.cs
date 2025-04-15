using System.IO;
using System.Text;

namespace StreamWriterDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            string filePath = @"../../../../data/StreamWriterDemo/streamdemofile.txt";

            FileInfo fileInfo = new FileInfo(filePath);

            // StreamWriter
            using (StreamWriter sw = fileInfo.CreateText())
            {
                Console.WriteLine($"'{fileInfo.Name}' file Created ✨");
                Console.WriteLine($"Attempting to Write Data In '{fileInfo.Name}'");
                sw.WriteLine("aaaaaaaaaaa");
                sw.WriteLine("bbbbbbbbbbb");
                sw.WriteLine("ccccccccccc");
                sw.Close();   //  it is optional because we are using (using) statement
                Console.WriteLine("Data Written Successfully! ✅");
            }

            // StreamReader
            FileStream filestream = new FileStream(filePath, FileMode.Open, FileAccess.Read);

            using (StreamReader sr = new StreamReader(filestream))
            {
                Console.WriteLine($"\nAttempting to Read Data From '{fileInfo.Name}'");
                Console.WriteLine("File Contents : ");
                string fileContents = sr.ReadToEnd();
                Console.WriteLine(fileContents);
            }
            Console.ReadKey();
        }
    }
}

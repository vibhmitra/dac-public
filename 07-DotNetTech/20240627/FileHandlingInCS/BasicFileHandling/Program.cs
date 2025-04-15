using System.Text;

namespace BasicFileHandling
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            string filePath1 = @"../../../../data/BasicFileHandling/file1.txt";
            string filePath2 = @"../../../../data/BasicFileHandling/file2.txt";
            string destination = @"../../../../data/BasicFileHandling/MovedFiles/" + Path.GetFileName(filePath2);
            string dummy = @"../../../../data/BasicFileHandling/dummy.txt";

            // Create | Copy | Move | Delete
            if (File.Exists(filePath1))
            {
                Console.WriteLine("👍 File Exist!");
                Console.WriteLine($"File Name : {Path.GetFileName(filePath1)}");
                Console.WriteLine("Attempting to Copy Content of 'file1.txt' to 'file2.txt' 👯‍");

                // Copying Content of file1.txt to file2.txt
                File.Copy(filePath1, filePath2, true);  // true will Copy in Overwrite Mode. | If you remove the 'true' it wil throw System IO Exception
                Console.WriteLine("✅ Copy Operation Was Successfull!");

                // Trying to Move 'file2.txt' to 'Moved/file2.txt'
                Console.WriteLine("Attempting to Move 'file2.txt' to 'MovedFiles/file2.txt' 🏃‍");
                File.Move(filePath2, destination, true);
                Console.WriteLine("✅ Move Success! Yeah!");

                // File Delete
                File.Create(dummy).Close();
                Console.WriteLine("Attempting to Delete 'dummy.txt' ❌");
                File.Delete(dummy);
                Console.WriteLine("'dummy.txt' Deleted Successfully! 👍");

            }
            else
            {
                Console.WriteLine("👎 File Doesn't Exist");
                Console.WriteLine("Attempting to Create File 📃");
                File.Create(filePath1).Close();
                Console.WriteLine("✅ File Created Successfully!");
            }
        }
    }
}

namespace DirectoryExample
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Create Directory
            string directoryPath = @"../../../../data/BasicFileHandling/";
            Directory.CreateDirectory(directoryPath);

            /*
                        string folder1 = directoryPath + @"\Folder1";
                        string folder2 = directoryPath + @"\Folder2";
                        string folder3 = directoryPath + @"\Folder3";

                        Directory.CreateDirectory(folder1);
                        Directory.CreateDirectory(folder2);
                        Directory.CreateDirectory(folder3);
            */

            // List All Files
            string[] listOfTextFile = Directory.GetFiles(@"../../../../data/BasicFileHandling/", "*.txt");
            Console.WriteLine("List Of All Files: ");
            foreach (string file in listOfTextFile)
            {
                Console.WriteLine(file);
            }
            Console.ReadKey();
        }
    }
}

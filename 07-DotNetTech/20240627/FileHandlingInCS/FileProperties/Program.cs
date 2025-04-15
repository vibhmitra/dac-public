namespace FileProperties
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filePath = @"../../../../data/BasicFileHandling/file1.txt";

            FileInfo fileInfo = new FileInfo(filePath);

            if (fileInfo.Exists)
            {
                Console.WriteLine("File Details > ");
                Console.WriteLine($"File Name : {fileInfo.Name}");
                Console.WriteLine($"File Extension : {fileInfo.Extension}");
                Console.WriteLine($"File Full Name : {fileInfo.FullName}");
                Console.WriteLine($"Creation Time : {fileInfo.CreationTime}");
                Console.WriteLine($"Last Access Time : {fileInfo.LastAccessTime}");
                Console.WriteLine($"Length : {fileInfo.Length}");
            }
            else
            {
                Console.WriteLine("Something isn't right!");
            }
        }
    }
}

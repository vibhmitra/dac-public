using System.Text;

namespace DestructorInCS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            Console.WriteLine("Hello, World! 😀");


            // creating objects using structure
            using (DB db = new DB())
            {
                db.DbConnection();
            }

            /*// creating objects
            using DB db = new DB();
            {
                db.DbConnection();
            }*/


            Console.ReadKey();
        }
    }
}

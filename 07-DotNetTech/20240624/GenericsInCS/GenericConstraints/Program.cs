namespace GenericConstraints
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            PrintMarks<PGDAC> printMarks = new PrintMarks<PGDAC>();
            printMarks.Stud = new PGDAC() { Marks = 85 };

            printMarks.Print();

        }
    }
}

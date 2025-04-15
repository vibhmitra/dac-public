namespace HelloWorldConsoleApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Here System prefix is just a namespace which
            is imported by default.*/
            System.Console.WriteLine("Hello!");

            // This is used to write on a console
            // Here if we use Line -> Adds a new Line After
            Console.WriteLine("Hello, World!");
            Console.Write("This is second Line!");
            Console.ReadKey(); // adds a pause until user input is given

        }
    }
}

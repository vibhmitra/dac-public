namespace ConsoleApp2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = System.Text.Encoding.UTF8;
            Console.WriteLine("If Statements! 🎆");

            Console.WriteLine("Please enter your age: ");
            int age = Convert.ToInt32(Console.ReadLine());

            if (age > 100)
            {
                Console.WriteLine("You are too old to sign up 🧓");
            }
            else if (age >= 18)
            {
                Console.WriteLine("You are now signed up! 💛💛");

            }
            else if (age < 0)
            {
                Console.WriteLine("You haven't been born yet! 🤔");
            }
            else
            {
                Console.WriteLine("You must be 18+ to sign up 👶");
            }
        }
    }
}

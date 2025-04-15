namespace VariableInCS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // declaring variable + initialization
            String name = "George";
            int age = 30;
            double salary = 2130.893;
            decimal stars = 10000000000;

            Console.WriteLine("There once was a guy named " + name);
            Console.WriteLine("He was " + age + " years old.");
            Console.WriteLine("His salary is $" + salary);
            Console.WriteLine("He has seen " + stars + "Starts");
            System.Console.ReadKey();
            //clear the screen
            System.Console.Clear();

            // other way to do the same
            String myStory = $"There once was a guy name {name}\nHe was {age} years old\nHis salary was ${salary}\nHe has seen {stars}";
            Console.WriteLine(myStory);

            // more data types
            char grade = 'A'; // for storing single char | Here SIZE of CHAR is *******>[ 2 Byte ]<<*******
            bool amIOkay = false;   // boolean data type
            bool amIDumb = true;

            Console.WriteLine(grade);
            Console.WriteLine(amIOkay);
            Console.WriteLine(amIDumb);

        }
    }
}

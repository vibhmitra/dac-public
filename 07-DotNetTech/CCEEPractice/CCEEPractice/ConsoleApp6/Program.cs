namespace ConsoleApp6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Overloaded constructors: technique to create multiple cnstructors, with a different 
            //                          set of parameters,
            //                          name + parameters = signature
            Pizza pizza = new Pizza("stuffed crust", "red sauce", "mozzarella");


            Console.ReadKey();
        }
    }

    class Pizza
    {
        String bread;
        String sauce;
        String cheese;
        String toppings;

        public Pizza(string bread)
        {
            this.bread = bread;
            Console.WriteLine("Your pizza is ready! pizza -> " + bread);
        }

        public Pizza(string bread, string sauce)
        {
            this.bread = bread;
            this.sauce = sauce;
            Console.WriteLine("Your pizza is ready! pizza -> " + bread + " " + sauce);
        }

        public Pizza(string bread, string sauce, string cheese)
        {
            this.bread = bread;
            this.sauce = sauce;
            this.cheese = cheese;
            Console.WriteLine("Your pizza is ready! pizza -> " + bread + " " + sauce + " " + cheese);
        }

        public Pizza(string bread, string sauce, string cheese, string toppings)
        {
            this.bread = bread;
            this.sauce = sauce;
            this.cheese = cheese;
            this.toppings = toppings;
            Console.WriteLine("Your pizza is ready! pizza -> " + bread + " " + sauce + " " + cheese + " " + toppings);
        }
    }
}

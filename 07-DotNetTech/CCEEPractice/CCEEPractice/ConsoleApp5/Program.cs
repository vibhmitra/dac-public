namespace ConsoleApp5
{
    // static = modifier to declare a static member, which belongs to the class it self
    //          rather that to any specific object.
    internal class Program
    {
        static void Main(string[] args)
        {
            Car car1 = new Car("Mustang");
            Car car2 = new Car("Corvette");
            Car car3 = new Car("Lambo");

            Console.WriteLine(Car.numberOfCars);

            Car.StartRace();

            //The idea behind static class and why we can't instanciate a Static class
            //Math math1 = new Math();
            //math1.Round(3.14);
            //Math.Round <- Makes more sense! Accessing using class name

            Console.ReadKey();
        }
    }

    class Car
    {
        String model;
        public static int numberOfCars;

        public Car(string model)
        {
            this.model = model;
            numberOfCars++;
        }

        public static void StartRace()
        {
            Console.WriteLine("The Race has begun");
        }
    }
}

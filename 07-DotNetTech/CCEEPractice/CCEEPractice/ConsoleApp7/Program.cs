namespace ConsoleApp7
{
    internal class Program
    {   // Inheritance - 1 or more child classes recieving fields, methods, etc, from 
        //               a common parent.
        static void Main(string[] args)
        {
            Car car = new Car();
            Bicycle bicycle = new Bicycle();
            Boat boat = new Boat();

            Console.WriteLine(car.speed);
            Console.WriteLine(car.wheels);
            car.go();
            Console.WriteLine(bicycle.speed);
            Console.WriteLine(bicycle.wheels);
            bicycle.go();
            Console.WriteLine(boat.speed);
            Console.WriteLine(boat.wheels);
            boat.go();

        }
    }

    // Abstract class - no instantiation 
    abstract class Vehicle
    {
        public int speed = 0;
        public void go()
        {
            Console.WriteLine("This vehicle is moving!");
        }
    }

    class Car : Vehicle
    {
        public int wheels = 4;
    }
    class Bicycle : Vehicle
    {
        public int wheels = 2;
    }
    class Boat : Vehicle
    {
        public int wheels = 0;
    }
}

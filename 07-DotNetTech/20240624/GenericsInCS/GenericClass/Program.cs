namespace GenericClass
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            User<int, int> user1 = new User<int, int>();
            User<bool, string> user2 = new User<bool, string>();

            // set value into genrics 
            user1.registrationStatus = 101;
            user2.registrationStatus = true;

            user1.Age = 22;
            user2.Age = "Range : (18 - 40)";

            // out
            Console.WriteLine($"User 1 <int, int> regStatus: {user1.registrationStatus}, Age {user1.Age}");
            Console.WriteLine($"User 2 <bool, string> regStatus: {user2.registrationStatus}, Age: {user2.Age}");
        }
    }
}

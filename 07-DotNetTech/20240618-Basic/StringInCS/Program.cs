namespace StringInCS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            String myString = "I am dumb!";
            Console.WriteLine(myString);
            Console.WriteLine(myString.ToUpper());
            Console.WriteLine(myString.ToLower());
            Console.WriteLine(String.Concat(myString, " Yes I am!"));
            Console.WriteLine(myString.Contains("dumb"));
            Console.WriteLine(myString.Contains("smart"));
            Console.WriteLine(myString[5]);
        }
    }
}

namespace TypeConversion
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Implicit Conversion (smaller to larger types)
            int num1 = 10;
            double num2 = num1; // Implicit conversion from int to double (no data loss)
            Console.WriteLine($"Implicit (int to double): {num2}");

            // Explicit Conversion (casting - larger to smaller types with potential data loss)
            double num3 = 3.14159;
            int num4 = (int)num3;// loosy conversion  // Explicit conversion (casting) from double to int (truncates decimal)
            Console.WriteLine($"Explicit (double to int - casting): {num4}");

            // Conversion with Parse methods (string to numeric types)
            string strNum = "123";
            int num5 = int.Parse(strNum); // Converts string to int
            Console.WriteLine($"Parse (string to int): {num5}");

            // Conversion with TryParse methods (string to numeric types with error handling)
            string strNum2 = "abc";
            int num6;
            bool success = int.TryParse(strNum2, out num6); // Attempts conversion, returns success and stores result in num6
            if (success)
            {
                Console.WriteLine($"TryParse (string to int - success): {num6}");
            }
            else
            {
                Console.WriteLine($"TryParse (string to int - failed): Conversion failed (non-numeric input)");
            }
        }
    }
}

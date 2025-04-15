using System.Text;
namespace UsingTryCatch
{
    internal class TryCatch
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            try
            {
                int num1, num2;
                Console.Write("Enter First Number : ");
                string input1 = Console.ReadLine();
                num1 = int.Parse(input1);

                Console.Write("Enter Second Number : ");
                string input2 = Console.ReadLine();
                num2 = int.Parse(input2);

                var result = num1 / num2;                   // CLR will create instance for DivideByZero and will thrown to Catch Block
                Console.WriteLine($"Result : {result}");
            }

            catch (DivideByZeroException ex)
            {
                Console.WriteLine($"{ex.Message} \"❌ \U0001f921");
            }

            Console.ReadKey();
        }
    }
}

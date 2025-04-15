using System.Text;

namespace ThreadCallBackFunction
{
    // Step 1: Create a Delegate.
    // The actual callback method signature should match with the
    // signature of the delegates

    public delegate void SumOfNumbersCallback(int sumOfNumbers);

    class Number
    {
        int _target;

        SumOfNumbersCallback _callbackMethod;
        public Number(int target, SumOfNumbersCallback callbackMethod)
        {
            _target = target;
            _callbackMethod = callbackMethod;
        }

        public void CalculateSumOfNumbers()
        {
            int sum = 0;
            for (int i = 0; i <= _target; i++)
            {
                sum += i;
            }

            if (_callbackMethod != null)
            {
                _callbackMethod(sum);
            }
            Console.WriteLine(sum);
        }

    }
    internal class ThreadCallBackFunction
    {
        public static void PrintNumbers(int sum) { Console.WriteLine($"The Sum of Numbers : {sum}"); }

        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            Console.Write("Enter the Target 🎯> ");
            int target = Convert.ToInt32(Console.ReadLine());

            // Step 2 : 
            SumOfNumbersCallback callback = new SumOfNumbersCallback(PrintNumbers);
            Number number = new Number(target, callback);

            Thread thread = new Thread(new ThreadStart(number.CalculateSumOfNumbers));

            thread.Start();

            Console.ReadKey();
        }
    }
}



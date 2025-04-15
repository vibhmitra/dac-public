using System.Diagnostics;
using System.Text;

namespace PerformanceOfMultithreading
{
    internal class PerformanceOfMultithreading
    {
        public static void EvenNumberSum()
        {
            double sum = 0;
            for (int i = 0; i <= 500000000; i++)
            {
                if (i % 2 == 0)
                    sum += i;
            }

            Console.WriteLine($"✨ Sum of EVEN Numbers : {sum}");
        }

        public static void OddNumberSum()
        {
            double sum = 0;
            for (int i = 0; i <= 50000000; i++)
            {
                if (!(i % 2 == 0))
                    sum += i;
            }
            Console.WriteLine($"✨ Sum of ODD Numbers : {sum}");
        }


        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            Stopwatch sw = new Stopwatch();
            Thread t1 = new Thread(EvenNumberSum);
            Thread t2 = new Thread(OddNumberSum);

            sw.Start();
            Console.WriteLine("**** Methods Call with Thread Concept ****");

            t1.Start();
            t2.Start();

            t1.Join();
            t2.Join();

            sw.Stop();

            Console.WriteLine($"⌛ (in ms) w/ Multi-Threads : {sw.ElapsedMilliseconds}");
            double threadDuration = sw.ElapsedMilliseconds;

            sw.Restart();

            Console.WriteLine("\n\n**** Methods Call without Thread Concept ****");

            EvenNumberSum();
            OddNumberSum();
            sw.Stop();

            Console.WriteLine($"⌛ (in ms) w/o Threads : {sw.ElapsedMilliseconds}");
            double callstackDuration = sw.ElapsedMilliseconds;

            double timeSaved = callstackDuration - threadDuration;
            Console.WriteLine($"\n\n⏰ Time Saved with Thread: {timeSaved} ms {(timeSaved > 0 ? "✅" : "Well That's Awkward! 🤔")}");

            Console.ReadKey();
        }
    }
}

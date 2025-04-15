using System.Diagnostics;
using System.Text;

// Tasks are not tied to specific threads.
// The ThreadPool dynamically allocates threads to
// tasks as needed. Understanding this distinction is crucial
// for effective asynchronous programming in C#.

namespace TaskExample
{
    class UpCounter
    {
        public void CountUp(int count)
        {
            Console.WriteLine("\nCount-UP Task Starts:");
            for (int i = 1; i <= count; i++) { Console.WriteLine($"👆 i = {i}"); }
            Console.WriteLine("\n👉 Count-UP Task Ends Here!");
        }
    }
    class DownCounter
    {
        public void CountDown(int count)
        {
            Console.WriteLine("\nCount-DOWN Task Starts:");
            for (int i = count; i >= 1; i--) { Console.WriteLine($"👇 i = {i}"); }
            Console.WriteLine("\n👉 Count-DOWN Task Ends Here!");
        }
    }
    internal class TaskExample
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            Stopwatch sw = Stopwatch.StartNew();
            sw.Start();

            UpCounter uc = new UpCounter();
            DownCounter dc = new DownCounter();

            // create an start the task
            // first way to create a task
            /* Task t1 = Task.Run(() =>
             {
                 uc.CountUp(10);
             });

             Task t2 = Task.Run(() =>
             {
                 dc.CountDown(10);
             });*/

            // Second way to create a Task in C#
            Task t1 = Task.Factory.StartNew(() => { uc.CountUp(10); });

            sw.Stop();

            double t1Time = sw.ElapsedMilliseconds;

            Task t2 = Task.Factory.StartNew(() => { dc.CountDown(10); });
            //t1.Wait();
            //t2.Wait();
            Task.WaitAll(t1, t2);

            Console.ReadKey();
        }
    }
}

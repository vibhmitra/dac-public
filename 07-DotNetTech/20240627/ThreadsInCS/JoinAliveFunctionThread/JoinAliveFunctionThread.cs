using System.Text;

namespace JoinAliveFunctionThread
{
    internal class JoinAliveFunctionThread
    {
        public static void Thread1Function()
        {
            // This thread got 18 seconds to complete 🦥🐌
            Console.WriteLine("🚀 Thread #1 Function Started");
            Thread.Sleep(5000);    // Introducing Artificial Latency  ✨✨🛡🛡
            Console.WriteLine("Thread #1 Function About To Return.");
            return;
        }

        public static void Thread2Function()
        {
            // This thread got 0 seconds to complete
            Console.WriteLine("🚀 Thread #2 Function Started");
            Thread.Sleep(50);
        }

        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            Console.WriteLine("Main Thread Started 🏃");
            Thread t1 = new Thread(Thread1Function);
            t1.Start();

            Thread t2 = new Thread(Thread2Function);
            t2.Start();


            if (t1.Join(1000))
                Console.WriteLine("Thread #1 Function Completed ✅");
            else
                Console.WriteLine("Thread #1 Function NOT Completed in 1 Seconds");


            t2.Join();
            Console.WriteLine("Thread #2 Function Completed ✅");

            for (int i = 0; i <= 10; i++)
            {
                if (t1.IsAlive) // Check if t1 is still alive
                {
                    Console.WriteLine("Thread #1 Function Still Running. 🏃‍");
                    Thread.Sleep(1000); // Check Every 1 Second
                }
                else
                {
                    Console.WriteLine("Thread #1 Function Completed ✅");
                    break;
                }
            }
            Console.WriteLine("Main Thread COMPLETED! 😃");
        }
    }
}

using System.Text;

namespace ProtectedSharedResources
{
    internal class ProtectSharedResources
    {
        static int total = 0;
        static object _lock = new object();
        public static void AddOneMillion()
        {
            for (int i = 0; i <= 100000000; i++)
            {
                //total++;  // ++ operator is not thread safe so either use MOnitor or use lock 
                /*
                // Making it Thread Safe Using Lock 
                lock (_lock)
                {
                    total++;
                }
                */
                // Using Monitor
                Monitor.Enter(_lock);
                try
                {
                    total++;
                }
                finally
                {
                    Monitor.Exit(_lock); // Freeing The Resorces
                }
            }
        }

        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            AddOneMillion();
            AddOneMillion();
            AddOneMillion();

            Console.WriteLine("Total Using Normal Call : " + total);

            total = 0;

            Thread t1 = new Thread(AddOneMillion);
            Thread t2 = new Thread(AddOneMillion);
            Thread t3 = new Thread(AddOneMillion);

            t1.Start();
            t2.Start();
            t3.Start();

            t1.Join();
            t2.Join();
            t3.Join();
            Console.WriteLine("Total Using Threads : " + total);

            Console.ReadKey();
        }
    }
}

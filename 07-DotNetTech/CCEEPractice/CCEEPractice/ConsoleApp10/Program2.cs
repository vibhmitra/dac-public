using System.ComponentModel;

namespace ConsoleApp10
{
    class Program2
    {

        public void threadExample2()
        {

            Task task1 = new Task(() =>
            {
                Console.WriteLine("Running task in seperate thread...");
                for (int i = 0; i < 1000; i++)
                {
                    int result = add(i, 0);
                    Console.WriteLine("Task O/P > " + result + " ");
                    Task.Delay(100).Wait();
                }
                Console.WriteLine("Task Completed!");
            });

            task1.Start();

            Console.WriteLine("Main Thread Ends! ");

            int add(int a, int b) => a + b;
        }
    }

}

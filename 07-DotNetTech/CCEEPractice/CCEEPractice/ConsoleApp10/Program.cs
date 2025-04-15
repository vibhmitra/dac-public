using ConsoleApp10;
// Thread is an execution path of program

internal class Program
{
    private static void Main(string[] args)
    {
        Console.OutputEncoding = System.Text.Encoding.UTF8;

        Program2 program = new Program2();

        program.threadExample2();

        Console.WriteLine("Hello, World!");

        Thread mainThread = Thread.CurrentThread;
        mainThread.Name = "Main Thread 🙅‍";
        //Console.WriteLine(mainThread.Name);
        //CountDown();
        //CountUp();

        Thread thread1 = new Thread(() => CountDown("🔽"));
        Thread thread2 = new Thread(() => CountUp("🔼"));

        thread1.Start();
        thread2.Start();

        Console.WriteLine(mainThread.Name + " is complete!");

        Console.ReadKey();

        /// Method Area
        static void CountDown(string text)
        {
            for (int i = 10; i >= 0; i--)
            {
                Console.WriteLine(text + " Timer #1  : " + i + " seconds    ");
                Thread.Sleep(1000);
            }
            Console.WriteLine("Timer #1 is complete!");
        }

        static void CountUp(string text)
        {
            for (int i = 0; i <= 10; i++)
            {
                Console.WriteLine(text + " Timer #2  : " + i + " seconds    ");
                Thread.Sleep(1000);
            }
            Console.WriteLine("Timer #2 is complete!");
        }
    }
}
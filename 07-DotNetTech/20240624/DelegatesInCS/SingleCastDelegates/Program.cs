namespace SingleCastDelegates
{
    // Delegates: 
    // - The return type of delegate should be same as target method
    // - Parameter must be same too.

    internal class Program
    {
        // Step 1: Declare Delegate for Target Method
        public delegate int AddDelegate(int a, int b);
        public delegate string MsgDelegate(String n);


        // Target Methods
        public int Add(int x, int y)
        {
            return (x + y);
        }

        public static string message(String name)
        {
            return ($"Hello, {name}!");
        }

        static void Main(string[] args)
        {
            // STEP : 2
            // Instantiating the Delegates
            Program program = new Program();
            AddDelegate addDelegate = new AddDelegate(program.Add);
            MsgDelegate msgDelegate = new MsgDelegate(message);         // message is in same class plus its static so no need to prefix 'program' object

            // STEP : 3
            // Calling Delegates
            // One Way to call it
            Console.WriteLine($"Sum (NormalCall): {addDelegate(2, 4)}");
            // Other Way to call it
            Console.WriteLine($"Sum (via Invoke): {addDelegate.Invoke(2, 4)}");

            Console.WriteLine(msgDelegate.Invoke("Ren"));

        }
    }
}

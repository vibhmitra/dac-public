namespace ActionDelegate
{
    // Action delegate type defined in the system namespace
    // An action delegate is the same as 'Func' delegate exept the 
    // action delegate doesn't return any value 
    // so, an action delegate can be used with a method whose return type 
    // is void
    // Action delegate can have 0 - 16 IN Params
    // It is also a Generic Type means jo daalo le lelegaa.
    internal class Program
    {
        public static void Add(int x, int y)
        {
            Console.WriteLine("SUM : " + (x + y));
        }
        public static void Diff(int x, int y)
        {
            Console.WriteLine("DIF: " + (x - y));
        }

        static void Main(string[] args)
        {
            Action<int, int> actionDLGT = Add;
            actionDLGT(100, 200);
            actionDLGT = Diff;
            actionDLGT(200, 100);
        }
    }
}

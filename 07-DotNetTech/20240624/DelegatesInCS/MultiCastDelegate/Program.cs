namespace MultiCastDelegate
{
    // MULTICAST DELGATE
    // - Return type of all targets must be same i guess **
    // - we can invoke and reinvoke
    // - We can declare delegates outside the class too.

    // STEP 1: DECLARE Single Delegate
    public delegate void calDelegate(int num1, int num2);


    internal class Program
    {
        // Target Methods For MultiCast Delegates
        public static void Add(int x, int y) => Console.WriteLine($"SUM : {x + y}");
        public static void Diff(int x, int y) => Console.WriteLine($"DIFF : {x - y}");
        public static void Product(int x, int y) => Console.WriteLine($"PORDUCT : {x * y}");
        public static void Division(int x, int y) => Console.WriteLine($"DIVISION : {x / y}");


        static void Main(string[] args)
        {
            Console.WriteLine("MULTICAST DELEGATE");
            Program program = new Program();
            calDelegate cal1 = new calDelegate(Add);
            calDelegate cal2 = new calDelegate(Diff);
            calDelegate cal3 = new calDelegate(Product);
            calDelegate cal4 = Division;    // Short-cut to instantiate OR program.Division

            // Create MUTI-CAST DELEGATE and Give Reference to methods
            calDelegate multiCastDelegate = cal1 + cal2 + cal3 + cal4;

            // Calling Delgates
            multiCastDelegate.Invoke(20, 3);

            // In future if you want to remove the purticular meth from multicast delgate
            multiCastDelegate -= cal1;
            Console.WriteLine();
            multiCastDelegate.Invoke(20, 3);
            return;
        }
    }
}

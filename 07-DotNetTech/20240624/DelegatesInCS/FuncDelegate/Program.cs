namespace FuncDelegate
{
    // Func is a generic delegate included in the system namespace
    // -    it can have 0 or more (0 <= No of Parameter <= 16) input parameter and
    //      1 output parameter.
    // -    It is used to hold the reference of one or
    //      more method with same signature & same type. 
    internal class Program
    {
        // Target Methods
        public static int Add(int x, int y) => x + y;
        public static int Diff(int x, int y) => x - y;

        static void Main(string[] args)
        {
            int result = 0;

            /*  Passing reference of Delegate to Func Delegate
             *  When you assign an anonymous function to a delegate 
             *  variable, the compiler performs a type compatibility check. 
             *  The delegate keyword helps facilitate this check.
                Func<int, int, int> funcDelegate = delegate(int x, int y)
                { return x + y; }; 
            */

            // Func delegate w/ Anonnymous method + lambda definition
            //  <in   in   out> delegateName = args to pass =>  return value   
            Func<int, int, int> funcDelegate = (x, y) => (x + y);

            // Direct calling Annonymous method.
            result = funcDelegate(600, 200);
            Console.WriteLine("Result (using annonymous function): {0}", result);

            // Passing Reference to the Method
            funcDelegate = Diff;
            result = funcDelegate(600, 200);
            Console.WriteLine("Result (By Passing Ref. of Target Methods): {0}", result);

            Console.ReadKey();
        }
    }
}

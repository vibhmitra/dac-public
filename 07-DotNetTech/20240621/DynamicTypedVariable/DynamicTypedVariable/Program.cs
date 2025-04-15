namespace DynamicTypedVariable
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*var varVar;       // ❌, we must init a Implicitly type 'var' as soon as it gets created*/
            var varVar = 7.7;   // ✅
            dynamic varDynamic; // this can be initialize afterwards
            varDynamic = 3;
            Console.WriteLine(varDynamic);
            Console.WriteLine(varVar);

        }
    }
}

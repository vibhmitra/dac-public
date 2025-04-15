using System.Text;

namespace LambdaExpressions
{
    internal class LambdaExpression
    {
        public delegate string msgDelegate(string name);

        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            // => is also called Goes To
            msgDelegate md = (name) => { return ($"Hello, {name}! 🥩 Dah!"); };
            Console.WriteLine(md.Invoke("Aura"));
        }
    }
}

using System.Text;

namespace AnnonymousMethods
{
    // Anonymous method in C#
    //  - is a method without having a name.
    //  - Can be defined using the delegate Event Keywords
    //  - Can be assigned to a variable of delegate type.
    internal class AnonymousMethod
    {
        public delegate string msgDelegate(string name);

        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            string? msg = "Anonymous method in C#";
            msgDelegate md = delegate (string name) // annonymous method
            {
                return name + " " + msg + "😊😊";
            };
            string msgResult = md.Invoke("this is an example of");
            Console.WriteLine(msgResult);
        }
    }
}

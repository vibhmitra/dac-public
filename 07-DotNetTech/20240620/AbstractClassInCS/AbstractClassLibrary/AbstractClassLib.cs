namespace AbstractClassLibrary
{
    // We Use Abstract Keyword to Declare a Class Abstract
    // Also, abstruct class may have abstract methods or Normal Method.
    public abstract class A
    {
        // abstract method
        public abstract void MethodA();
        public void NormalMethod()
        {
            Console.WriteLine("Normal Method Inside Abstract class.");
        }
    }

    public class B : A
    {
        /** ABSTRACTION:
         * Here Class B Has to Implement the abstract methods of 
         * Class A. ITS A MUST. ⚠
         * Use 'Override' Keyword
         */

        public override void MethodA()
        {
            Console.WriteLine("I am Method of Class A. 👩");
        }

        public void MethodB()
        {
            Console.WriteLine("I am Method of Class B. 👶");
        }

        // Method Hiding is Performe Here using 'new' keyword
        public new void NormalMethod()
        {
            base.NormalMethod();    // calling it using 'base' Keyword
            Console.Write("Normal Method Inside Child.");
        }
    }
}

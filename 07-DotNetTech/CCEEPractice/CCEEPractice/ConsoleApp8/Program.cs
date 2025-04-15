using System.Data.Common;

namespace ConsoleApp8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Animal animal = new Animal();
            animal.Speak();

            Dog dog = new Dog();
            dog.Speak();

            Cat cat = new Cat();
            cat.Speak();
        }
    }

    //Method Overriding = Provides a new version of method inherited from a parent
    //                    class.
    //                    Inherited method must be virtual, abstract or already overriden.
    //                    Used with ToString() and Polymorphism
    class Animal
    {
        public virtual void Speak()
        {
            Console.WriteLine("Animal goes *brrr*");
        }

        //public abstract void Speak(); <- This 
    }

    class Dog : Animal
    {
        public override void Speak()
        {

            Console.WriteLine("Dog goes *woff*");
        }
    }
    class Cat : Animal
    {
        public override void Speak()
        {

            Console.WriteLine("Cat goes *meow*");
        }
    }


}



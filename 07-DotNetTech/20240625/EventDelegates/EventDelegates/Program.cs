using EventDelegateLibrary;

namespace EventDelegates
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Publisher publisher = new Publisher();
            Subscriber subscriber = new Subscriber();

            publisher.MyEvent += subscriber.Add;   // Adding the event
                                                   //   publisher.MyEvent -= subscriber.Add;   // removing the event

            // invoke the event
            publisher.RaiseEvent(100, 200);
            publisher.RaiseEvent(200, 400);
            publisher.RaiseEvent(500, 600);
            Console.ReadKey();

        }
    }
}

namespace EventDelegates
{
    public class Subscriber
    {
        // target
        public void Add(int x, int y)
        {
            Console.WriteLine($"SUM : {(x + y)}");
        }

    }
}

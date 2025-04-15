namespace EventDelegateLibrary
{
    // create delegate
    public delegate void MyDelegateType(int a, int b);
    public class Publisher
    {
        // private delegate
        private MyDelegateType? MyD;

        // step 1: create event
        public event MyDelegateType MyEvent
        {
            add { MyD += value; }
            remove { MyD -= value; }

        }
        public void RaiseEvent(int a, int b)
        {
            // Step 2: Raise Event
            if (MyD != null)
            {
                MyD(a, b);
            }
        }

    }
}

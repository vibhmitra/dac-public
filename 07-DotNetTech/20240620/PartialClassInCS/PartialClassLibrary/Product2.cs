namespace PartialClassLibrary
{
    public partial class Product
    {
        // private fields
        private double _cost;
        // property
        public double Cost { get => _cost; set => _cost = value; }


        public void GetTax()
        {
            Console.WriteLine($"Product ID : {ProductID}");
            Console.WriteLine($"Cost : {Cost}");
            Console.Write("Tax : ");
            CalculateTax(); // Calling is Done Here In `Product2.cs` file.
        }


    }
}

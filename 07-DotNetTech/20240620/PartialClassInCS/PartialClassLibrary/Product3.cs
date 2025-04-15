namespace PartialClassLibrary
{
    public partial class Product
    {
        partial void CalculateTax() // Implementation is Done in `Product3.cs`
        {
            double tax = Cost * 0.10;
            Console.WriteLine(tax);
        }
    }
}
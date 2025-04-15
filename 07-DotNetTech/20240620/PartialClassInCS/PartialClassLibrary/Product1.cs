namespace PartialClassLibrary
{
    public partial class Product
    {
        // private field
        private int _productID;

        public int ProductID { get => _productID; set => _productID = value; }

        // Partial method | also partial meths are by default private
        partial void CalculateTax(); // Declaration In `Product1.cs` file.

    }
}
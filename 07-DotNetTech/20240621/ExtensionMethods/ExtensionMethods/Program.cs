

using ExtensionClassLibrary;
using System.Text;

namespace ExtensionMethods
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            Console.WriteLine("Hello, World!");

            Product product = new Product() { productCost = 499.00, discountInPercent = 10.0 };

            Console.WriteLine($"🤑🤑 Discount : {product.GetDiscount()} 🔥🔥");
            Console.WriteLine(ProductExtension.GetDiscount(product));
            product.hello();
            Console.ReadKey();
        }
    }
}

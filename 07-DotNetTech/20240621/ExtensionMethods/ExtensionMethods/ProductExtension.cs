
using ExtensionClassLibrary;
using System.Reflection;

namespace ExtensionMethods
{
    public static class ProductExtension
    {
        // create extension method | this will inject External Class 💉
        public static double GetDiscount(this Product product)
        {
            return (product.productCost * product.discountInPercent / 100);
        }

        public static void hello(this Product p)
        {
            Console.WriteLine("Hellovia from Extension");

            // Get Info Of the Class
            Type type = typeof(Product);
            MethodInfo[] methods = type.GetMethods();
            PropertyInfo[] properties = type.GetProperties();

            foreach (MethodInfo method in methods)
            {
                Console.WriteLine($"Method Name: {method.Name}");
            }

            foreach (PropertyInfo property in properties)
            {
                Console.WriteLine($"Property Name: {property.Name}");
            }
        }


    }
}

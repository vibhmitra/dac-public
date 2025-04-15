using FieldsClassLibrary;

namespace FieldsInCS
{

    class AverageIncome
    {
        public void totalCost(double item1, double item2, double item3, int noOfProducts)
        {
            double avgCost = calAvg();
            Console.WriteLine("Cost of Item 1: " + item1);
            Console.WriteLine("Cost of Item 2: " + item2);
            Console.WriteLine("Cost of Item 2: " + item3);
            Console.WriteLine("Average : " + avgCost);

            // Local Function | THAT MEANS
            double calAvg()
            {
                return Math.Round((((item1 + item2 + item3) / noOfProducts)), 2);
            }
        }
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            // Local COnst
            const String managerName = "Binny";

            // create instances of for variables
            Product product1 = new Product();
            Product product2 = new Product();
            Product product3 = new Product();

            // field init
            product1.ProductID = 1001;
            product1.ProductName = "Phone";
            product1.qtyInStock = 120;
            product1.cost = 1999;

            product2.ProductID = 1002;
            product2.ProductName = "AC";
            product2.qtyInStock = 23;
            product2.cost = 2999;

            product3.ProductID = 1003;
            product3.ProductName = "Laptop";
            product3.qtyInStock = 20;
            product3.cost = 5000;

            Product.brandName = "Sony"; // change will applied for all

            String prod1Details = $"Brand:{Product.brandName}\nID:{product1.ProductID}\nName: {product1.ProductName}\nCost:{product1.cost}\nQty:{product1.qtyInStock}\nDate Of Purchase : {product1.dateOfPurchase}\nManager Name:{managerName}";
            String prod2Details = $"Brand:{Product.brandName}\nID:{product2.ProductID}\nName: {product2.ProductName}\nCost:{product2.cost}\nQty:{product2.qtyInStock}\nDate Of Purchase : {product2.dateOfPurchase}\nManager Name:{managerName}";
            String prod3Details = $"Brand:{Product.brandName}\nID:{product3.ProductID}\nName: {product3.ProductName}\nCost:{product3.cost}\nQty:{product3.qtyInStock}\nDate Of Purchase : {product3.dateOfPurchase}\nManager Name:{managerName}";


            // display
            Console.WriteLine("Product 1 Details > ");
            Console.WriteLine(prod1Details);
            Console.WriteLine("Product 2 Details > ");
            Console.WriteLine(prod2Details);
            Console.WriteLine("Product 3 Details > ");
            Console.WriteLine(prod3Details);


            // taxes
            Console.WriteLine();
            Console.WriteLine($"Tax 1: {product1.getTax()}\tTotal Cost:{product1.getTax() + product1.cost}");
            Console.WriteLine($"Tax 2: {product2.getTax()}\tTotal Cost:{product2.getTax() + product2.cost}");
            Console.WriteLine($"Tax 3: {product3.getTax()}\tTotal Cost:{product3.getTax() + product3.cost}");
            Console.ReadKey();

            Console.WriteLine("TOT QTY: " + (product1.qtyInStock + product2.qtyInStock + product3.qtyInStock));

            AverageIncome average = new AverageIncome();
            average.totalCost(product1.cost, product2.cost, product3.cost, 3);
        }
    }



    // inheriting External class

    public class InternationalProducts : Product
    {
        public void method()
        {
            Product product = new Product();
        }
    }

    public class OtherClass2
    {
        public void method()
        {
            Product product = new Product();
            product.qtyInStock = 23; // public of outer class is accessible
        }
    }
}

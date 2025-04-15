namespace FieldsClassLibrary
{
    public class Product
    {
        // fields
        /*private int ProductID;
        protected internal string? ProductName; // the question mark is just for making string nullable
        internal double cost;
        public int qtyInStock;*/

        public int ProductID;
        public string? ProductName; // the question mark is just for making string nullable
        public double cost;
        public int qtyInStock;

        public static String brandName = "SUMOSUNG";
        public const int constValue = 5;    // constant fields require value to be init same line as it get declared | via Class Only
        public readonly String dateOfPurchase;  // can be init here or via constructor | also can accessible via Object

        public Product()
        {
            // constValue = 23; // not valid
            dateOfPurchase = System.DateTime.Now.ToShortDateString();  // we can init readonly field via constructor
        }

        public double getTax()
        {
            /*
                cost <= 2000; tax = 10%
                cost > 2000; tax = 12.25%
             */
            if (cost <= 2000)
            {
                return (cost * 0.10);
            }
            else if (cost > 2000)
            {
                return (cost * 0.1225);
            }
            else
                return (0);
        }

    }

    // Inheritance
    public class DomesticProdcuts : Product
    {
        public DomesticProdcuts()
        {
            //ProductID = 0;    // not valid| private
            qtyInStock = 0;     // valid    | public
            ProductName = null; // valid    | protected
            cost = 0;           // valid    | internal
        }

        //Other Class At the same assembly
        public class OtherClass
        {
            public void method()
            {
                Product product = new Product();
                //product.ProductID = 1; // not valid


            }
        }
    }
}

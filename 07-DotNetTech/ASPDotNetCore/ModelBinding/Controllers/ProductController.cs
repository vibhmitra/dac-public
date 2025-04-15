using Microsoft.AspNetCore.Mvc;
using ModelBinding.Models;

namespace ModelBinding.Controllers
{
    public class ProductController : Controller
    {
        [Route("/")]
        public IActionResult Index()
        {
            List<Product> products = new List<Product>()
            {
                new Product() { ProductID = 101, ProductName = "Car", Rate = 23280.76 },
                new Product() { ProductID = 102, ProductName = "AC", Rate = 228023.67 },
                new Product() { ProductID = 103, ProductName = "Computer", Rate = 93280.26 },
                new Product() { ProductID = 104, ProductName = "Pizza", Rate = 12380.74 },
            };

            return View(products);
        }

        [Route("/product/about")]
        public IActionResult About()
        {
            return View();
        }

        [Route("/contact")]
        public IActionResult Contact()
        {
            return View();
        }

        [Route("/product/details")]
        public IActionResult Details(int id)
        {
            List<Product> products = new List<Product>()
            {
                new Product() { ProductID = 101, ProductName = "Mouse", Rate = 23280.76 },
                new Product() { ProductID = 102, ProductName = "AC", Rate = 228023.67 },
                new Product() { ProductID = 103, ProductName = "Computer", Rate = 93280.26 },
                new Product() { ProductID = 104, ProductName = "Pizza", Rate = 12380.74 },
            };

            Product matchingProduct = null;
            foreach (Product product in products)
            {
                if (product.ProductID == id)
                {
                    matchingProduct = product;
                }
            }
            Console.WriteLine(matchingProduct.ProductName);
            return View(matchingProduct);
        }

        // get request
        [HttpGet]
        public IActionResult Create()
        {
            return View();
        }

        // post request
        [HttpPost]
        public IActionResult Create(Product product)
        {

            //return View(product);
            return Json(product);
        }
    }
}

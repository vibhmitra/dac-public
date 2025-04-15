using Microsoft.AspNetCore.Mvc;
using ProductManagementSystem.Data;
using ProductManagementSystem.Models;

namespace ProductManagementSystem.Controllers
{
    public class ProductController : Controller
    {

        private readonly ApplicationDBContext _db;
        public ProductController(ApplicationDBContext db)
        {
            _db = db;
        }

        /* Main View Index page */
        public IActionResult Index()
        {
            // To list method works as select * from product
            //  var prodobj = _db.products.ToList();
            IEnumerable<Product> products = _db.products;
            return View(products);
        }

        [HttpGet]
        public IActionResult AddProduct()
        {
            return View();
        }

        [HttpPost]
        public IActionResult AddProduct(Product product)
        {
            if (ModelState.IsValid)     // Validation
            {
                _db.products.Add(product);  // Adding Data to Table
                _db.SaveChanges();          // To Commit the data
                TempData["success"] = "Product ADDED Successfully!";    // Temp Data
                return RedirectToAction("Index", "Product"); // Here the second Parameter is controllers name, here it is optional  
                //return View(product);
            }
            else
                return View(product);
        }


        //[HttpGet, ActionName("Update")]   // The Action Method Naming is optional by default it will Call method of that same name
        [HttpGet]
        public IActionResult EditProduct(int? id)
        {
            if (id == 0 || id == null)
            {
                return NotFound();
            }

            var productFromDb = _db.products.Find(id);
            if (productFromDb == null)
            {
                return NotFound();
            }

            return View(productFromDb);
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public IActionResult EditProduct(int id, Product p)
        {
            // THIS CODE NEED HEAVY MODIFICATION

            var productFromDb = _db.products.Find(id);

            if (productFromDb == null) { return NotFound(); }
            _db.products.Update(productFromDb);
            _db.products.Add(p);
            _db.SaveChanges(true);

            //_db.products.Update(product);  // Adding Data to Table
            //_db.SaveChanges();          // To Commit the data

            return RedirectToAction("Index", "Product");
        }


        [HttpGet]
        public IActionResult DeleteProduct(int? id)
        {
            if (id == 0 || id == null) { return NotFound(); }
            var productFromDb = _db.products.Find(id);
            if (productFromDb == null) { return NotFound(); }
            return View(productFromDb);
        }

        [HttpPost]
        public IActionResult DeleteProduct(int id)
        {
            var productFromDb = _db.products.Find(id);
            if (productFromDb == null) { return NotFound(); }
            _db.products.Remove(productFromDb);
            _db.SaveChanges();
            TempData["success"] = "Product DELETED Successfully!";
            return RedirectToAction("Index", "Product");
        }

        [Route("/Product/filter")]
        public IActionResult Search(string search = "")
        {
            Product product = new Product();
            ViewBag.SearchKey = search;

            List<Product> productList = _db.products.Where(x => x.ProductName.Contains(search)).ToList();

            return View("Index", productList);
        }
    }
}

using Microsoft.AspNetCore.Mvc;

namespace IActionResultExample.Controllers
{
    public class BookStoreController : Controller
    {
        [Route("bookstation/books/{id}")] // 👈 The id here is 
        public IActionResult BookStore()
        {
            int id = Convert.ToInt32(Request.RouteValues["id"]); // same as ID in here
            return Content($"<h2>Book Station, Book : {id}</h2>", "text/html");
        }
    }
}

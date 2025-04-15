using Microsoft.AspNetCore.Mvc;

namespace IActionResultExample.Controllers
{
    public class HomeController : Controller
    {
        [Route("/")]
        public IActionResult home()
        {
            return Content("" +
                "<head>" +
                "<meta charset=\"UTF-8\">" +
                "<h1>Book Store Home Page :) 📚</h1>" +
                "<p>Usage: localhost:{port}/api/bookstore?BookId={enter book id here}</p>" +
                "<a href='/api/bookstore?BookId=45'>http://localhost:port/api/bookstore?BookId=45</a>", "text/html");
        }


        [Route("api/bookstore")]
        public IActionResult Index()
        {
            // Book ID
            if (!Request.Query.ContainsKey("BookId")) // Here Query is the this '?' after this
            {
                //return (new BadRequestResult());
                return (BadRequest("Book ID Not Available!"));  // the short version | Returns BadRequest Response
            }

            if (string.IsNullOrEmpty(Convert.ToString(Request.Query["BookId"])))
            {
                return BadRequest("Book ID Cannot Be Empty Mate!");
            }

            int Id = Convert.ToInt32(ControllerContext.HttpContext.Request.Query["BookId"]);

            if (Id <= 0 || Id > 500)
            {
                return (NotFound("Book ID Must Be Between 1 & 500, (Also we only have like 500 books in our library for some reason)"));
            }

            //return Content($"Book Store, Book {Id}", "text/plain");

            return (new LocalRedirectResult($"~/bookstation/books/{Id}", true)); // OLD WEBSITE PERMANETLY MOVED TO NEW LOCATION
            //return Redirect($"~/bookstation/books/{Id}"); // OLD WEBSITE PERMANETLY MOVED TO NEW LOCATION
            //return RedirectPermanent($"~/bookstation/books/{Id}"); // 301
        }
    }
}

using Microsoft.AspNetCore.Mvc;

namespace ViewsExample.Controllers
{
    public class HomeController : Controller
    {
        [Route("/")]
        public IActionResult Index()
        {
            return View(); // Views -> Home -> Index.cshtml
            //return View("myhome"); // if view is of different name that of the Action method
        }

        [Route("/about")]
        public IActionResult About()
        {
            return View();
        }
    }
}

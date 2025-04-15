using Microsoft.AspNetCore.Mvc;

namespace LayoutExample.Controllers
{
    public class HomeController : Controller
    {
        [Route("/home")]
        [Route("/")]
        public IActionResult Index()
        {
            return View();
        }

        [Route("/home/about")]
        public IActionResult About()
        {
            return View();
        }

        [Route("/home/contact")]
        public IActionResult Contact()
        {
            return View();
        }

        [Route("/home/profile")]
        public IActionResult Profile()
        {
            return View();
        }
    }
}

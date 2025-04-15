using Microsoft.AspNetCore.Mvc;

namespace RazorViewEngine.Controllers
{
    public class AdminController : Controller
    {
        [Route("/dashboard")]
        public IActionResult Dashboard()
        {
            return View();
        }
    }
}

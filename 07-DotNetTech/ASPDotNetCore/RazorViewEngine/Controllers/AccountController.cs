using Microsoft.AspNetCore.Mvc;

namespace RazorViewEngine.Controllers
{
    public class AccountController : Controller
    {
        [Route("/api/login")]
        public IActionResult login(string username, string password)
        {
            if (username == "admin" && password == "root")
            {
                return RedirectToAction("Dashboard", "Admin"); //  Method inside Admin Controller
            }
            else
            {
                return RedirectToAction("InvalidLogin");
            }
        }

        [Route("/invalid")]
        public IActionResult InvalidLogin()
        {
            return View();
        }
    }
}

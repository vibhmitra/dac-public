using FluentAPIValidation.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace FluentAPIValidation.Controllers
{
    public class HomeController : Controller
    {


        public IActionResult Index()
        {
            return View();
        }

        [Route("/register")]
        public IActionResult Register()
        {
            return View();
        }
        [HttpPost]
        public IActionResult Register(RegistrationModel model)
        {
            if (!ModelState.IsValid)
            {
                // Validation failed, return to the form with errors
                return View(model);
            }
            // Handle successful validation logic here
            return RedirectToAction("Success");
        }
        public string Success()
        {
            return "Registration Successful";
        }
    }
}

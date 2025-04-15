using Microsoft.AspNetCore.Mvc;
using ViewBagExample.Models;

namespace ViewBagExample.Controllers
{
    public class HomeController : Controller
    {
        [Route("/")]
        public IActionResult Index() // The view name must be same as this method name.
        {
            ViewData["title"] = "View Bag Example";
            List<Person> personList = new List<Person>()
            {
                new() { Name = "Rei", DOB = DateTime.Parse("2001-12-13"), PersonGender = Gender.Male },
                new() { Name = "Mei", DOB = DateTime.Parse("2002-10-12"), PersonGender = Gender.Female },
                new() { Name = "Kate", DOB = DateTime.Parse("2003-11-09"), PersonGender = Gender.Female }
            };
            ViewBag.PersonList = personList;
            return View();
        }
    }
}

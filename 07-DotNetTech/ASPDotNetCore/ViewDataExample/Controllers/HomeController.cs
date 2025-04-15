using Microsoft.AspNetCore.Mvc;
using ViewDataExample.Models;
namespace ViewDataExample.Controllers
{
    public class HomeController : Controller
    {
        [Route("/")]
        public IActionResult Index()
        {
            ViewData["title"] = "View Data Example";
            List<Person> listPerson = new List<Person>()
            {
                new Person() { Name = "John", DOB = DateTime.Parse("2001-12-13"), PersonGender = Gender.Male },
                new Person() { Name = "Kohn", DOB = DateTime.Parse("2002-10-12"), PersonGender = Gender.Male },
                new Person() { Name = "Kate", DOB = DateTime.Parse("2003-11-09"), PersonGender = Gender.Female },

            };
            ViewData["person"] = listPerson;
            return View();
        }
    }
}

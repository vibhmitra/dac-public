using Microsoft.AspNetCore.Mvc;

namespace RazorViewEngine.Controllers
{
    public class HomeController : Controller
    {
        [Route("/")]
        public IActionResult Index()
        {
            return View();
        }

        [Route("/products")]
        public IActionResult Products()
        {
            return View("CompanyProducts");
        }

        [Route("/contact")]
        public IActionResult Contact()
        {
            return View();
        }

        [Route("/api/empName")]
        public IActionResult GetEmpName(int empId)
        {
            var employees = new[]
            {
                new {EmpId = 101, EmpName = "John", Salary = 45000},
                new {EmpId = 102, EmpName = "Ren", Salary = 47000},
                new {EmpId = 103, EmpName = "William", Salary = 45000},
                new {EmpId = 104, EmpName = "William", Salary = 45000},
                new {EmpId = 105, EmpName = "William", Salary = 45000},
            };

            string matchEmpName = null;
            foreach (var item in employees)
            {
                if (item.EmpId == empId)
                {
                    matchEmpName = item.EmpName;
                }
            }
            if (matchEmpName != null)
            {
                return Content(matchEmpName, "text/plain");
            }
            else
            {
                return Content("Employee Not Found", "text/plain");
            }
            // http://localhost:port/api/empdetails?empId=101
        }

        [Route("/studentdetails")]
        public IActionResult StudentDetails()
        {
            ViewBag.StudentId = 901;
            ViewBag.StudentName = "Student Zack";
            ViewBag.Marks = 0;
            ViewBag.NoOfSemester = 8;
            ViewBag.Subjects = new List<string> { "Maths", "DSA", "C++", "WPT" };
            return View();
        }
    }
}

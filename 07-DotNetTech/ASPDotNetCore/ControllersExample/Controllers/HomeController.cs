using ControllersExample.Models;
using Microsoft.AspNetCore.Mvc;

namespace ControllersExample.Controllers
{
    public class HomeController : Controller
    {
        // The Parent of All of these return type methods are IActionResult interface
        [Route("/")]
        public IActionResult Index()
        {
            //return new ContentResult() { Content = "Hello From Index Action Method", ContentType = "text/html" };
            //  return Content("Hello From The Indexxx!!", "text/html");
            return Content("<head><meta charset=\"UTF-8\"></head><h1>Welcome To Home 🏡</h1>", "text/html");
        }
        [Route("/personJSON")]
        public IActionResult Person()
        {
            Person person = new Person() { Id = Guid.NewGuid(), FirstName = "Mei", LastName = "Zu", Age = 23 };
            return Json(person);
        }

        // 
        [Route("VirtualFileDownload")]
        public IActionResult VFileDownload() // when file is inside the server
        {
            return File("/SampleFile.pdf", "application/pdf");
        }

        [Route("PhysicalFileDownload")]
        public IActionResult PFileDownload() // when file is outside the server path 
        {
            return PhysicalFile(@"C:\Users\VIBH\Desktop 2\SampleFile.pdf", "application/pdf");
        }

        [Route("FileContentResult")]
        public IActionResult FileContentResult() // byte wise byte
        {
            byte[] bytesResult = System.IO.File.ReadAllBytes(@"C:\Users\VIBH\Desktop 2\SampleFile.pdf");
            return File(bytesResult, "application/pdf");
        }



        /*// The Parent of All of these methods methods are IActionResult interface
        [Route("/")]
        public ContentResult Index()
        {
            //return new ContentResult() { Content = "Hello From Index Action Method", ContentType = "text/html" };
            //  return Content("Hello From The Indexxx!!", "text/html");
            return Content("<head><meta charset=\"UTF-8\"></head><h1>Welcome To Home 🏡</h1>", "text/html");
        }
        [Route("/personJSON")]
        public JsonResult Person()
        {
            Person person = new Person() { Id = Guid.NewGuid(), FirstName = "Mei", LastName = "Zu", Age = 23 };
            return Json(person);
        }

        // 
        [Route("VirtualFileDownload")]
        public VirtualFileResult VFileDownload() // when file is inside the server
        {
            return File("/pika.pdf", "application/pdf");
        }

        [Route("PhysicalFileDownload")]
        public PhysicalFileResult PFileDownload() // when file is outside the server path 
        {
            return PhysicalFile(@"C:\Users\CDAC\Desktop\pika.pdf", "application/pdf");
        }

        [Route("FileContentResult")]
        public FileContentResult FileContentResult() // byte wise byte
        {
            byte[] bytesResult = System.IO.File.ReadAllBytes(@"C:\Users\CDAC\Desktop\pika.pdf");
            return File(bytesResult, "application/pdf");
        }*/
    }
}

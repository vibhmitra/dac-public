﻿using Microsoft.AspNetCore.Mvc;

namespace ViewsExample.Controllers
{
    public class StudentController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}

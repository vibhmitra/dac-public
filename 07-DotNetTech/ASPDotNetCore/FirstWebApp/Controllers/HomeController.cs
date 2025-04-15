using Microsoft.AspNetCore.Mvc;

namespace FirstWebApp.Controllers
{
    // [Controller]         // using attribute
    // public class Home    // this is out controller named Home It is mandatory to suffix all controllers winth the word 'Controllers'
    // { ... }
    [Controller]
    public class HomeController
    {
        // ActionMethods
        [Route("home")]
        [Route("/")]    // You can Add Upto one root path
        public string Index()
        {
            return "Hello from Index() ActionMethod 🙋‍♂️";
        }

        [Route("/about")]
        public string About()
        {
            return "Hello from About() ActionMethod (❁´◡`❁)";
        }

        [Route("/contacts/{mobile:regex(^\\d{{10}}$)}")]
        public string Contact()
        {
            return "Hello from Contact() ActionMethod 📞";
        }
    }
}

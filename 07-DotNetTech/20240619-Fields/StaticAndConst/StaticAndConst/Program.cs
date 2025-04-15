using System.Text;

namespace StaticAndConst
{
    public class School
    {
        public const string location = "India";
        public static int mandatoryCourse = 6;
        public int optionalCourses = 0;
        public String schoolName = "SchoolName";

        public void getInfo(School school)
        {
            Console.WriteLine($"School Name       : {school.schoolName}");
            Console.WriteLine($"Optional Courses  : {school.optionalCourses}");
            Console.WriteLine($"Mandatory Courses : {School.mandatoryCourse}");
            Console.WriteLine($"Location Courses  : {School.location}");
            Console.Write("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖\n");
            return;
        }
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            // Let Say we have three schools that wants to use 
            // Class and Basic standard of School Class
            School IowaJuniorHigh = new School();
            School RezJuniorHigh = new School();
            School MaxPlaySchool = new School();

            // For IowaJuniorHigh
            IowaJuniorHigh.schoolName = "Iowa Junio High School";
            IowaJuniorHigh.optionalCourses = 12;
            /**
            IowaJuniorHigh.mandatoryCourses = 7;    // this is invalid| Static Fields Can't Be Accessed Via Objects
            IowaJuniorHigh.location = "New York";   // this is invalid| Const Can't be accessed via Obj + Cannot be modified
            */
            IowaJuniorHigh.getInfo(IowaJuniorHigh);

            // A New Standard of School comes 😛 and
            // Government decided to add 1 sub to mandatory course
            // We Have to Now Modifiy the No of Courses;
            // this can be done by ACCESSING that Field via Class Name
            // Note** WE CANT ACCESS IT WITH OBJECTS
            // This value is shared by all objects
            School.mandatoryCourse++;
            Console.WriteLine("Updated Info: ");
            IowaJuniorHigh.getInfo(IowaJuniorHigh);

            // Some other School Wants to Make its Object
            // For Rez Juior High
            RezJuniorHigh.schoolName = "Rez Junior High";
            RezJuniorHigh.optionalCourses = 3;
            RezJuniorHigh.getInfo(RezJuniorHigh);

            // Now what if School Class now wants to change its Location.
            //School.location = "New York"; <-- Well This is Invalid too, cuz CONSTANT

            return;
        }
    }
}

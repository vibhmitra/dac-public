using System.Text;

namespace StudentLINQQuery
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;

            Console.WriteLine("Names Before Sorting");
            List<Student> studList = Student.getAllStudent();
            foreach (Student student in studList)
            {
                Console.WriteLine("👉 " + student.StudentName);
            }

            // Get All in Sorted Order 
            IOrderedEnumerable<Student> sortedList = Student.getAllStudent().OrderBy(x => x.StudentName);
            Console.WriteLine("\nSorted List USing IOrderEnumerable");
            foreach (Student student in sortedList)
            {
                Console.WriteLine("👉 " + student.StudentName);
            }

            // Using IEnumerable
            Console.WriteLine("\nSorted List Using IEnumerable");
            IEnumerable<Student> sortedList2 = Student.getAllStudent().OrderBy(x => x.StudentName);
            foreach (Student student in sortedList)
            {
                Console.WriteLine("👉 " + student.StudentName);
            };

            // 
            Console.WriteLine("\nSorted List | OrderBy with Using Extension");
            IOrderedEnumerable<Student> sortedList3 = from student in Student.getAllStudent() orderby student.StudentName select student;
            foreach (Student s in sortedList3)
            {
                Console.WriteLine("👉 " + s.StudentName);
            }

            Console.ReadKey();
        }
    }
}

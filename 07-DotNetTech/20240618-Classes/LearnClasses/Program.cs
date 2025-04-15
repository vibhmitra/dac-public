using StudentClassLibrary;  // calling libraries from other projects

namespace LearnClasses
{
    class Student
    {
        public int Id;
        public string? Name;
        public double percentMarks;
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            /* Working With Local Classes */
            // creating instance of internal class student
            Student student = new Student();

            // Taking Inputs
            Console.Write("Enter Student ID : ");
            student.Id = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Student Name : ");
            student.Name = Convert.ToString(Console.ReadLine());
            Console.Write("Enter Student Marks : ");
            student.percentMarks = Convert.ToDouble(Console.ReadLine());

            string message = $"Hello! {student.Name}, (id - {student.Id}), You Have Scored {student.percentMarks} % ";
            Console.WriteLine(message);


            /* Learing Class Libraries (Just a List of classes without Driver) */

            // creating object of the external class which is in different project
            Result result = new Result(student.percentMarks);
            Console.WriteLine(result.getResult());
            Console.ReadKey();
        }
    }
}

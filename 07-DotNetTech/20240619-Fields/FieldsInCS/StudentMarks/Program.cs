namespace LocalFunctionStudentMarks
{
    class Student
    {
        /*double avgMarks;*/
        public void DisplayMarks(double marks1, double marks2, double marks3)
        {
            double avg1 = avgMarks();
            //double avg1 = avgMarks(marks1, marks2, marks3);   // for calling static function
            Console.WriteLine($"Marks 1:{marks1}");
            Console.WriteLine($"Marks 2:{marks2}");
            Console.WriteLine($"Marks 3:{marks3}");
            Console.WriteLine($"Average:{avg1}");



            // this is :LOCAL FUNCTION
            double avgMarks()
            {
                return (double)Math.Round((marks1 + marks2 + marks3) / 3);
            }

            // static function will only access static variable
            /*static double avgMarks(double m1, double m2, double m3)
            {
                return (double)Math.Round((m1 + m2 + m3) / 3);
            }*/
        }


        internal class Program
        {
            static void Main(string[] args)
            {
                Student student = new Student();
                student.DisplayMarks(123, 232, 334);

                //student.avgmarks(); // Local Function cannot be accessible via Objects
            }
        }
    }
}

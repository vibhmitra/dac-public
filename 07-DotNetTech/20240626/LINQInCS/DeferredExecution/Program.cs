namespace DeferredExecution
{
    internal class Student
    {
        public int StudentId { get; set; }
        public string? StudentName { get; set; }
        public int totalMarks { get; set; }

        public override string? ToString()
        {
            return ($"id : {StudentId}, name: {StudentName}, totalMarks: {totalMarks}");
        }
    }


    internal class Program
    {
        static void Main(string[] args)
        {
            List<Student> studList = new List<Student>()
            {
                new Student { StudentId = 101, StudentName = "Katie", totalMarks = 90 },
                new Student { StudentId = 102, StudentName = "Ava", totalMarks = 70 },
                new Student { StudentId = 103, StudentName = "Aura", totalMarks = 80 },
                new Student { StudentId = 104, StudentName = "Mig", totalMarks = 88 },
                new Student { StudentId = 105, StudentName = "Mike", totalMarks = 68 }
            };

            // LINQ Query only defined And is will not execute at this point
            IEnumerable<Student> results = from student in studList where student.totalMarks > 80 select student;

            studList.Add(new Student { StudentId = 106, StudentName = "Mille", totalMarks = 91 });  // This will first checked by query then will be added to the list i guess.

            Console.WriteLine("\nList of Student Who Scored more than 80: ");
            foreach (Student student in results)
            {
                Console.WriteLine(student.ToString());
            }

            int count = (from student in studList where student.totalMarks > 80 select student).Count();
            Console.WriteLine($"Total Number Record : {count}");
        }
    }
}

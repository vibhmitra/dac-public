namespace StudentLINQQuery
{
    internal class Student
    {
        public int StudentId { get; set; }
        public string? StudentName { get; set; }
        public int totalMarks { get; set; }

        public static List<Student> getAllStudent()
        {
            List<Student> studList = new List<Student>()
            {
                new Student { StudentId = 101, StudentName = "Katie", totalMarks = 90 },
                new Student { StudentId = 102, StudentName = "Ava", totalMarks = 70 },
                new Student { StudentId = 103, StudentName = "Aura", totalMarks = 80 },
                new Student { StudentId = 104, StudentName = "Mig", totalMarks = 88 }
            };
            return (studList);
        }

        public override string? ToString()
        {
            return ($"id : {StudentId}, name: {StudentName}, totalMarks: {totalMarks}");
        }
    }
}

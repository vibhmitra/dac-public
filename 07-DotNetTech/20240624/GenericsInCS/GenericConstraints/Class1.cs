
namespace GenericConstraints
{

    public abstract class Student
    {
        public abstract int Marks { get; set; }
    }

    public class PGDAC : Student
    {
        public override int Marks { get; set; }
    }

    public class PGDBDA : Student
    {
        public override int Marks { get; set; }
    }


    // Work for Both Child Class as Well As Parent Class
    public class PrintMarks<T> where T : Student
    {
        public T Stud;
        public void Print()
        {
            Student student = (Student)Stud;
            Console.WriteLine($"{student.GetType()} Marks : {student.Marks} 😀");
        }
    }

}

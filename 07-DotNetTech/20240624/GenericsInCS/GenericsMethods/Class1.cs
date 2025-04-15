namespace GenericsMethods
{
    public class Employee
    {
        public int Salary;
    }

    public class Student
    {
        public int Marks;
    }

    public class Test
    {
        // Generic Methods
        public void printData<T>(T obj) where T : class  // Here obj is just a reference variable 'class' will replased by its class name
        {
            // If Class Passed to it is of 'Student' Type
            if (obj.GetType() == typeof(Student))
            {
                Student student = obj as Student; // 'as' keyword is used
                Console.WriteLine(student.Marks);
            }
            else if (obj.GetType() == typeof(Employee))
            {
                Employee employee = obj as Employee;
                Console.WriteLine(employee.Salary);
            }
        }
    }
}

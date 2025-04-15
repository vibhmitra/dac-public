namespace PartialClassLibrary
{
    public class Employee
    {
        public string? EmpName { get; set; }
        public string? email { get; set; }
        public AgeGroupEnumeration agegroup { get; set; } // user defined data type
    }

    public enum AgeGroupEnumeration : short // here data type will be of family of int, by default its int
    {
        Child,
        Teenager,
        Adult,
        Senior
    }
}

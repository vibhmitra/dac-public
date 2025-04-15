
namespace InheritanceClassLibrary
{
    public class Manager : Employee
    {
        // private
        private string? _departmentName;

        // constructor of Child Class
        public Manager(int empId, string? empName, string? empLocation, string departmentName) : base(empId, empName, empLocation)
        {
            _departmentName = departmentName;
        }

        public String? departmentName
        {
            get { return _departmentName; }
            set { _departmentName = value; }
        }

        public long getNoOfHealthInsuarance()
        {
            return 1000;
        }
        // Method
        public string getFullDepartmentName()
        {
            return ($"{departmentName} at 👉 {base.empLocation}");
        }

        /*
                // method hiding : to hide parent class methods
                public new string getHealthInsuranceAmt()       // If you want to hide the parent class method you have to use new keyword
                {
                    return ($"Total Health Insuarance (Manager): " + 2500);
                }
        */

        // mehtod overriding + sealed method | only overriden methods can be sealed
        public sealed override string getHealthInsuranceAmt()
        {
            Console.WriteLine(base.getHealthInsuranceAmt());    // calling parent class method
            return ($"Total Health Insuarance (Manager): " + 2500);
        }
    }
}

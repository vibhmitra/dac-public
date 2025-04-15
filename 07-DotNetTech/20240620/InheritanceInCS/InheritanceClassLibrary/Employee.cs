namespace InheritanceClassLibrary
{
    public class Employee
    {
        // sealed classes
        sealed class HR
        {

        }

        /**
        public class HOD : HR   // invalid : HR is sealed NO one can inherit it.
        {

        }
        */

        // private fields
        private int _empId;
        private string? _empName;
        private string? _empLocation;

        // properties
        public int empId
        {
            get { return _empId; }
            set { _empId = value; }
        }

        public string? empName
        {
            get { return _empName; }
            set { _empName = value; }
        }

        public string? empLocation
        {
            get { return _empLocation; }
            set { _empLocation = value; }
        }

        // Constuctor of Employee (Base Class)
        public Employee(int empId, string? empName, string? empLocation)
        {
            this.empId = empId;
            this.empName = empName;
            this.empLocation = empLocation;
        }

        // now after adding virtual keyword this become 'VIRTUAL METHOD' and ready to be overrriden
        public virtual string getHealthInsuranceAmt()
        {
            return ($"Total Health Insuarance (Base:Employee) : " + 1500);
        }
    }
}

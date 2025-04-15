

namespace InheritanceClassLibrary
{
    public class Salesman : Employee
    {


        // priv fields
        private string? _region;

        public Salesman(int empId, string? empName, string? empLocation, string? Region) : base(empId, empName, empLocation)
        {
            _region = Region;
        }

        public string? Region
        {
            get { return _region; }
            set { this._region = value; }
        }
        /*
                // method hiding
                public new string getHealthInsuranceAmt()       // If you want to hide the parent class method you have to use new keyword
                {
                    return ($"Total Health Insuarance (Sales): " + 4500);
                }
        */

        // mehtod overriding
        public override string getHealthInsuranceAmt()
        {
            Console.WriteLine(base.getHealthInsuranceAmt());   // calling parent class method
            return ($"Total Health Insuarance (Sales): " + 4500);
        }

        public long GetTotalSalesOfYear()
        {
            return 1000;
        }
    }
}


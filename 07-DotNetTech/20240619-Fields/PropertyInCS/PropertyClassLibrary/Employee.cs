namespace PropertyClassLibrary
{
    public class Employee
    {
        // Our Fields
        private int _id;
        private string? _empName;
        private string? _email;
        private static string _companyName;

        private string _countryName = "India";
        public string CountryName
        {
            get => _countryName;
            set => _countryName = value;
        }

        // Normal Constructor
        public Employee(int id, string empName, string email)
        {
            Id = id;
            EmpName = empName;
            Email = email;
        }
        // Static Constructor | Just that value will be shared amoung other objects
        static Employee()
        {
            _companyName = "Aurora Music AS";
        }

        /// <summary>
        /// Properties with backing fields:
        /// - Has get / set accessor
        /// - set can perform data validation | get can manupulate data before returning.
        /// </summary>
        public int Id
        {
            get
            {
                return (_id);
            }
            set
            {   // see how set is performing validation before setting Id
                if (value > 0 && value <= 1000)
                {
                    _id = value;
                }
            }
        }

        public string? EmpName
        {
            get
            {
                return (_empName);
            }
            set
            {
                _empName = value;
            }
        }

        public string? Email
        {
            get
            {
                return (_email);
            }
            set
            {
                _email = value;
            }
        }

        /// <summary>
        /// Expression body definitions:
        /// </summary>
        public string CompanyName
        {
            get => _companyName;
            set => _companyName = value;
        }

        // implements the read-only Name property as an expression-bodied member.
        public string FullAddress => $"{_companyName}, {_countryName}.";
    }
}


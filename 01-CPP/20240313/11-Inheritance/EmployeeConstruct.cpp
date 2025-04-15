#include <iostream>

using namespace std;

class Employee
{
    public:
        int empID;
        float empSalary;
        string empName;

    // DEFAULT CONSTRUCTOR <-- INVOKED AUTOMATICALLY
    Employee()
    {
        cout << "Default Constructor" << endl;
        empDetails();
    }



    // PARAMETRIZED CONSTRUCTOR -- TAKES PARAMETER OFC
    Employee (int i, float s, string n)
    {
        empID = i ;
        empSalary = s;
        empName = n;

    }

    void empDetails()
    {
        cout << "EMP ID     : " << empID << endl;
        cout << "EMP SAL    : " << empSalary << endl;
        cout << "EMP NAME   : " << empName << endl;
    }
};

int main()
{
    Employee empObj0;   // THIS WILL INVOKE DEFAULT CONSTRUCTOR | CONSTRUCTOR W/O PARAMETER
    //empObj0.empDetails();

    Employee empObj1(101, 9800, "Mike A");            // Directly Invoking via Object
    Employee empObj2 = Employee(102, 50000, "Mike B"); // Invoking PARAMETRIZED CONSTRUCTOR

    empObj1.empDetails();
    empObj2.empDetails();

    return 0;
}

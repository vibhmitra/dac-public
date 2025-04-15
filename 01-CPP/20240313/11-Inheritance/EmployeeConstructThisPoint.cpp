#include <iostream>

using namespace std;

class Employee
{
    public:
        int empID;
        float empSalary;
        string empName;

    Employee()
    {
        cout << "Default Constructor" << endl;
        //empDetails();
    }

    // Use of 'this' Pointer
    Employee (int empID, float empSalary, string empName)
    {
        this -> empID = empID ;               // use 'this' pointer when variable name of parameter is same as name of the variable inside class.
        this -> empSalary = empSalary;
        this -> empName = empName;

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

#include <iostream>

using namespace std;

class Employee
{
    private:
        float salary;   // NOT ACCESSIBLE IN MAIN
    public:
        int empId;
        string empName;

        void empDetails()
        {
            cout << "Employee Details : " << endl;
        }

};

int main()
{
    Employee empObj;

    empObj.empId = 1011;
    empObj.empName = "Mike Willson";
    // empObj.salary = 7823.34;     <--- THIS WILL NOT ACCESS PRIVATE ELEMENTS FROM THE CLASS LIKE THAT

    empObj.empDetails();
    cout << "Employee ID : " << empObj.empId << endl;
    cout << "Employee Name : " << empObj.empName << endl;

    return 0;
}

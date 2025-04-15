#include <iostream>

using namespace std;

class Address
{
    public:
        string AddressLine, City, State;
        Address (string AddressLine, string City, string State)
        {
            this -> AddressLine = AddressLine;
            this -> City = City;
            this -> State = State;
        }
};

class Employee
{
    private:
        Address *address;   // HAS A RELATIONSHIP

    public:
        int Id;
        string Name;

        Employee(int Id, string Name, Address *address)
        {
            this -> Id = Id;
            this -> Name = Name;
            this -> address = address;
        }

        void empDetails()
        {
            cout << Id << " " << Name << " " << address -> AddressLine << " " << address -> City << " " << address -> State;
        }
};


int main()
{
    Address adobj = Address("LINE", "CITY", "STATE");
    Employee emp = Employee(123, "MO", &adobj);
    emp.empDetails();
    return 0;
}

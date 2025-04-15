#include <iostream>

using namespace std;

// BASE CLASS | SUPER CLASS | PARENT CLASS
class BaseClass
{
    public:
        int length, bredth;
        int area() { return (length * bredth); }

};

// CHILD | SUB | DERIVED CLASS
class ChildClass : public BaseClass
{
    public:
        int height;
        int Volume() { return (area() * height); }
};

int main()
{
    ChildClass *ChildObj = new ChildClass();

    ChildObj -> length = 3;        // Here child object is accessing variable from the Base Class.
    ChildObj -> bredth = 6;
    ChildObj -> height = 2;

    cout << "AREA: " << ChildObj -> area() << endl;
    cout << "VOLU: " << ChildObj -> Volume() << endl;

    delete []ChildObj;  // Clearing HEAP Maybe


    return 0;

}

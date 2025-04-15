#include <iostream>

using namespace std;

class Base
{
    int x;
    public:
        Base()
        {
            cout << "Default Construct of Base Class. " << endl;
        }
        Base (int x)
        {
            cout << "x Base Class: " << x << endl;
        }
};

class Child : public Base
{

    public:
        Child()
        {
            cout << "Default Construct of Child Class. " << endl;
        }

        Child (int y): Base (y)
        {
            cout << "y Base Class: " << y << endl;
        }
};


int main()
{


    Child chObj0;
    Child chObj1(100);

    return 0;
}

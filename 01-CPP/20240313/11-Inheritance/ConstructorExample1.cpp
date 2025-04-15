#include <iostream>

using namespace std;

class Rectangle
{
    public:
        int length, breadth;

        // DEFAULT Constructor --> with no parameter
        Rectangle()
        {
            length = 10;
            breadth = 4;
        }
};

int main()
{
    Rectangle recObj;
    cout << "Lenght: " << recObj.length << endl;
    cout << "Breadth: " << recObj.breadth << endl;

    return 0;
}

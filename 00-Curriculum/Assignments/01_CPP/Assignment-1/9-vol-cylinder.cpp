/* Problem 9 : Program to calculate Volume of Cylinder. */
#include <iostream>

using namespace std;

int main()
{
    const float pi = 3.14159;
    float height, radius;

    cout << "Enter Height: ";
    cin >> height;
    cout << "Enter Radius: ";
    cin >> radius;

    cout << "Volume of Cylinder : " << pi * radius * radius * height << " cubic units" << endl;
    return 0;
}

/* Problem 5 : Cal Area, Perimeter and Volume of these:
                -   circle
                -   rectangle
                -   triangle                */

#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    const float pi = 3.1415;
    float radius, length, breadth;

    cout << "CIRCLE:" << endl;
    cout << "Enter Radius for Circle: ";
    cin >> radius;
    cout << "Area : " << (pi * radius * radius) << " sq. units." << endl;
    cout << "Circumference: " << (2 * pi * radius) << " units.\n\n";

    cout << "RECTANGLE:" << endl;
    cout << "Enter Length for Rectangle: ";
    cin >> length;
    cout << "Enter Breadth for Rectangle: ";
    cin >> breadth;
    cout << "Area : " << length * breadth << " sq. units." << endl;
    cout << "Perimeter : " << 2 * (length + breadth) << " units.\n\n";

    cout << "TRIANGLE:" << endl;
    cout << "Enter base for Triangle: ";
    cin >> breadth;
    cout << "Enter height for Triangle: ";
    cin >> length;
    cout << "Area : " << (length * breadth) / 2 << " sq. units." << endl;
    cout << "Perimeter : " << (length + breadth + sqrt((length * length) + (breadth * breadth))) << " units.\n\n";

    return 0;
}

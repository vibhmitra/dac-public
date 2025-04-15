#include <iostream>
#include "Rectangle.h"      // double quotes for user-defined header file.

using namespace std;

int main()
{
    Rectangle recObj;
    recObj.length = 1;
    recObj.breadth = 9;

    cout << "AREA: " << recObj.areaRec() << endl;
    cout << "PERIMETER: " << recObj.perimeterRec() << endl;

    return 0;
}

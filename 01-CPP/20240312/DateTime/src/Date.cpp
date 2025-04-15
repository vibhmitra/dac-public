#include <iostream>
#include "Date.h"

using namespace std;

void Date::isLeapYear(int y)
{
    if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)  )
    {
            cout << "YEAR " << y <<" > LEAP!" << endl;
    }
    else
    {
         cout << "YEAR " << y <<" > NOT LEAP!" << endl;
    }
}

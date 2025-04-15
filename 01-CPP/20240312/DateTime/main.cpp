#include <iostream>
#include "Date.h"

using namespace std;

int main()
{
    Date::isLeapYear(400);      // always access static function usin its class name; it is kinda of a good practice.
    Date::isLeapYear(2024);
    Date::isLeapYear(100);

    return 0;
}

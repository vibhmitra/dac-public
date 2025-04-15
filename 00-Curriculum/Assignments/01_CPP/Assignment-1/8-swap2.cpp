/* Problem 7: To swap two integers (WITHOUT THIRD VARIABLE). */
#include <iostream>

using namespace std;

int main()
{
    int a = 90, b = 42, t;

    cout << "Before Swap: " << endl;
    cout << "A = " << a << endl;
    cout << "B = " << b << endl;

    // Swap Logic (without third variable)
    a = a + b;
    b = a - b;
    a = a - b;

    cout << "After Swap: " << endl;
    cout << "A = " << a << endl;
    cout << "B = " << b << endl;

    return 0;
}

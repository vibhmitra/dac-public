/* Problem 7: To swap two integers. */
#include <iostream>

using namespace std;

int main()
{
    int a = 10, b = 23, t;

    cout << "Before Swap: " << endl;
    cout << "A = " << a << endl;
    cout << "B = " << b << endl;

    // Swap Logic
    t = a;
    a = b;
    b = t;

    cout << "After Swap: " << endl;
    cout << "A = " << a << endl;
    cout << "B = " << b << endl;

    return 0;
}

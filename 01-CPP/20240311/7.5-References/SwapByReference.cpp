/* Swap By Reference */

#include <iostream>

using namespace std;

void swapByRef(int& x, int &y)      // Changes does affect main function | the value reference is given to x and y.
{
    int temp = x;
    x = y;
    y = temp;
}

void swapByValue(int x, int y)      // Changes did not affect in main function | the value is just copied.
{
    int temp = x;
    x = y;
    y = temp;
}

int main()
{
    int a = 0, b = 20;

    cout << "Before Swap: \n";
    cout << "a : " << a << endl
         << "b : " << b << endl;

    swapByValue(a, b);
    cout << "After Swap by value: \n";
    cout << "a : " << a << endl
         << "b : " << b << endl;

    swapByRef(a, b);
    cout << "After Swap by Ref: \n";
    cout << "a : " << a << endl
         << "b : " << b << endl;

    return (0);

}

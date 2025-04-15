#include <iostream>
using namespace std;

void CallByValue(int x)
{
    x++;
    cout << "Value 'a' copied into 'x' (call by value) after ++ operation       : " << x << endl;
}


void CallByRef(int& y)
{
    y++;
    cout << "Value 'y' referring to 'a' (call by reference) after ++ operation  : " << y << endl;
}

int main()
{
    int a = 10;

    cout << "Value of a (before calling by value function)                      : " << a << endl << endl;


    CallByValue(a);
    cout << "Value of a (after calling by value function)                       : " << a << endl << endl;

    CallByRef(a);
    cout << "Value of a (after calling by reference function)                   : " << a << endl;


    cin.get();
    return 0;
}

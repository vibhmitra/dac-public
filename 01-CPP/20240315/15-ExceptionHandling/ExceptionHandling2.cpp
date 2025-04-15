#include <iostream>

using namespace std;

int Division(int x, int y)
{
    if (y == 0)
    {
        throw (1);
    }
    return (x / y);
}

int main()
{
    int n1, n2;

    cout << "Enter The First Number > ";
    cin >> n1;
    cout << "Enter The Error Number > ";
    cin >> n2;



    try
    {
        cout << "Result : " << Division(n1, n2) << endl;  // Function Called

    }
    catch (int ERR)                 // Catches the Variable Thrown by Function if Exception happened.
    {
        cout << "Divide By 0 Exception Occurred.\n" ;
        cout << "Exception Handled Successfully!." << endl;
    }



    return 0;
}

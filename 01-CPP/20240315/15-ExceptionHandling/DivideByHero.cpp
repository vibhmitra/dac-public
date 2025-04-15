#include <iostream>

using namespace std;


int main()
{
    int n1, n2, r ;

    cout << "Enter The First Number > ";
    cin >> n1;
    cout << "Enter The Error Number > ";
    cin >> n2;
    try
    {
        if (n2 == 0)
        {
            throw (1);      // This will throw (1) to the nearest catch() block.
        }

        r = n1 / n2;

        cout << "Result : "<< r << endl;

    }
    catch (int err)
    {
        cout << "Divide By 0 Exception Occurred.\n" ;
    }

    cout << "Exception Handled Successfully!." << endl;

    return 0;
}

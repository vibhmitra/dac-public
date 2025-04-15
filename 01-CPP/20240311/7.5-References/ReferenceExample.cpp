#include <iostream>
using namespace std;

int main()
{
    int a = 10;
    int &b = a;     // This is reference variable

    int c = 100;


//     int &b = c;      // this is not valid here | one reference is set it is permanent for that variable.



    cout << "a : " << a << endl
         << "b : " << b << endl;

    b++;

    cout << "a : " << a << endl
         << "b : " << b << endl
         << "&a : " << &a << endl       // Both Have same address
         << "&b : " << &b << endl;


    b = c;  // since b is referencing to the a, it will overwrite the data with value of C.
    cout << "c : " << a << endl
         << "b : " << b << endl
         << "a : " << c << endl;


    cin.get();
    return 0;
}

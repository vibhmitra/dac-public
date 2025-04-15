#include<iostream>
using namespace std;
int main()
{
    // --X

    int x = 10;
    int y = x--;
    cout<<"Value of X = "<<x <<endl;
    cout<<"Value of Y = "<<y <<endl;

    int z, p = 10;
    // z = ++p++;   <---- ERROR
    z = (++p)++; // <---- RIGHT
    cout << "Value of p: " << p << endl;
    cout << "Value of z: " << z << endl;

    z = 10; p = 10;
    z = p++*10;
    cout << "Value of p: " << p << endl;
    cout << "Value of z: " << z << endl;

    /*  x = 10;
        y = ++x;    // x = 11, y = 11
        z = y--;    // z = 11, y = 10
        p = z++;    // p = 11, z = 12
    */
}

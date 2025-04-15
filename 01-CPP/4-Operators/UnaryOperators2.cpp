#include<iostream>
using namespace std;
int main()
{
    int x = 3,
        y = 4,
        z = 2,
        p = 1;

    p *= x;         //  p = 1 * 3 = 3
    p *= y;         //  p = 3 * 4 = 12
    p -= x + y +z;  //  p = 12 - (3 + 4 + 2) = 3
    cout << "Value of p: "<<p<<endl;
    return 0;
}

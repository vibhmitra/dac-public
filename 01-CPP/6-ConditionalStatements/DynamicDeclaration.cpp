// Dynamic Declaration
#include <iostream>
using namespace std;
int main()
{
    int a = 10, b = 20;

    if(int c = a + b; c > 15)               // <--- WE CAN DECLARE AND ASSIGN VARIABLE INSIDE THE IF STATEMENT BUT ITS SCOPE WILL BE LTD
//  if (int c = a + b;)                        <--- NOT ALLOWED
//  if (int c = a + b)                         <--- ALLOWED this is same as if(30) which is obviously true.
    {
        cout <<"c is greater that 15; value of C = " << c;
    }
    else
    {
        cout << "Value of C = " << c << endl;
    }


    // cout << "Value of C (outside)= " << c << endl;   <---- THIS WILL THROW ERROR
}

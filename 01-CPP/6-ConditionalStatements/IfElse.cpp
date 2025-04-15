// DANGLING ELSE EXAMPLE

#include <iostream>
using namespace std;

int main()
{
   /* int i = 0, j = 0;
    if(i == 0)
        if(j == 10)
            cout << "i and j are zero."<<endl;
    else cout << "i is not zero."<<endl;    // whenever this condition arise, the ELSE statement always associated with the closest possible IF.


    return 0;
}
*/
    int a=10, b=20, c = 30;
    if(a>b) {
        cout<<"A is grater than B" <<endl;
    }
    else if( b>c) {
        cout<<"B is grater than A"<<endl;
        }
    else {
        cout<<"C is greater than B"<<endl;
    }

}

#include <iostream>

using namespace std;

int main()
{
    int x = 10;
    int *ptr0 = &x;         // Single Pointer
    int **ptr1 = &ptr0;     // Double Pointer
    int ***ptr2 = &ptr1;    // Triple Pointer
    int ****ptr3 = &ptr2;   // Quadruple Pointer

    cout << "x : " << x << "\n";
    cout << "ptr0 : " << ptr0 << "\t\t&ptr0 :  "<< &ptr0 << "\t\t*ptr0 : " << *ptr0 << "\n"
         << "ptr1 : " << ptr1 << "\t\t&ptr1 :  "<< &ptr1 << "\t\t**ptr1 : " << **ptr1 << "\n"
         << "ptr2 : " << ptr2 << "\t\t&ptr2 :  "<< &ptr2 << "\t\t**ptr2 : " << ***ptr2 << "\n"
         << "ptr3 : " << ptr3 << "\t\t&ptr3 :  "<< &ptr3 << "\t\t**ptr3 : " << ****ptr3 << "\n";


    int y = 20;
    int& z1 = y;        // Alias Name
    int& z2 = z1;
    int& z3 = z2;

    cout << "y : " << y << endl;
    cout << "z1 : " << z1 << endl;
    cout << "z2 : " << z2 << endl;

    z2 = 6;         // <----- Here we are changing value of z2, and value of y is also getting changed
    cout << "y : " << y << endl;

    int num = 12;
    void *num2 = &num;  // Valid
//  void &num3 = num;   // Not Valid, will not accept Void


    return 0;

}

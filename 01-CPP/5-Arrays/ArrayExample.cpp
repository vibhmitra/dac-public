#include <iostream>
using namespace std;
int main()
{
    // Array Initialization
    int num[3] = {10, 20, 30};
    int num2[] = {10, 20, 30, 40, 50};
    int num3[5] = { 1, 2, 3};   // all other element will get value = 0
    //  int numm[3] = {1, 2, 3, 4, 5}; <-- NOT ALLOWED
    int num4[5] = {0};  // all elements will get value 0; it will also work this -> int num4[5] = {}
    int num5[5] = {};

    for (int i = 0; i < 5; i++)
    {
        cout << num3[i] << "  ";
    }

    cout << endl;

    // String Array
    string name[] = {"John", "Kate"};
    for (int i = 0; i < 2; i++)
    {
        cout << name[i] << "  ";
    }

    cout << endl;

    // For Each Loop
    for(int temp : num2)
    {
        cout << temp << "  ";
    }

    cout << endl;

    // finding size of an array
    cout << "Size of num2 : " << sizeof(num2)/sizeof(num2[0]) << endl;
}

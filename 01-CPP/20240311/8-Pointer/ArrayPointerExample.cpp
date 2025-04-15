#include <iostream>
using namespace std;

int main()
{
    int arr[5] = {10, 20, 30, 40, 50};
    int *ptr;
    ptr = arr; //

    cout<< arr << endl;    // will print address of first element
    cout<< *arr << endl; // will print the first element i.e., arr[0] = 10
    cout<< &arr[0] << endl; // will print the address of first element
    cout<< *(arr + 1) << endl;    // 20
    cout<< *(arr + 4) << endl;    // 50

    cout << *(ptr + 2) << endl; // will print value 30
    cout << *ptr << endl;
    cout << ptr << endl;

    return 0;
}

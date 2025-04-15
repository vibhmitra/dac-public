#include <iostream>
using namespace std;

int main()
{
    int arr[5] = {10, 20, 30, 40, 50};
    int *ptr1 = new int[10];

    for(int i=0;i<10;i++)
    {
       *ptr1 = i;
    }
    int *ptr2 = ptr1;

    delete []ptr2;
    cout << *ptr1;

    return 0;
}

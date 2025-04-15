#include <iostream>
using namespace std;
int main()
{
    // Array Initialization

    int searchElement;
    int n;
    int sw = 0;

    // take size
    cout << "Enter Size : ";
    cin >> n;

    int num[n]; // init array.

    // get elements
    for (int i = 0; i < n; i++)
    {
        cout << "Enter Element " << (i+1) <<" : ";
        cin >> num[i];
    }

    // print array.
    for(int i : num) { cout << i << " "; }
    cout << endl;

    // printing size for some reason :/
    cout << "Array Size : " << sizeof(num)/sizeof(int) << endl; // Here we are dividing with data type to determine No of Element.

    // search
    cout << "Enter the element you want to search > ";
    cin >> searchElement;

    // giving output
    for (int i = 0; i < n; i++ )
    {
        if (searchElement == num[i])
        {
            cout << "Element found at index " << i << ", Element Value: " << num[i] << endl;
            sw = 1;     // changing switch to = 1, if element gets found.
        }
    }

    // if not found
    if (sw != 1)
    {
        cout << "Element Not Found!";
    }

    return 0;
}

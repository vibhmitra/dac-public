#include <iostream>
using namespace std;
int main()
{
    // Array Initialization

    int searchElement;
    int n;
    int index = 2;

    int num[] = { 1, 2, 3, 4, 5 };

/*
    // get elements
    for (int i = 0; i < n; i++)
    {
        cout << "Enter Element " << (i+1) <<" : ";
        cin >> num[i];
    }
*/

     // ++num[index];       // <------ value at that index position will be increamen
    num[num[index++]] = 100;

    for (int i = 0; i < 5; i++)
    {
        cout << num[num[i]] << " ";
    }

    return 0;
}

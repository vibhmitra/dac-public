#include <iostream>

using namespace std;

void increment()
{
    int v[] = {0,1,2,3,4,5,6,7,8,9};
    for (auto& x : v) {
        ++x;
        cout << x << '\n';
    }
}

int main()
{
    int v1[10] = {0,1,2,3,4,5,6,7,8,9};
    int v2[10] = {0};

    auto x = 'Z';
    auto y = 'A';
    cout << (char) (x /y) << endl;

    for (auto i=0; i!=10; i++)
        v2[i] = v1[i];

    int* p = v2;    // Giving Index Value of Array.

    for (auto x : v2)
        cout << *(p + x) << '\n';

    for (auto x : {10,21,32,43,54,65})
        cout << x << '\n';

    cout << endl << "Increment array by ref: " << endl;

    increment();

    return 0;
}

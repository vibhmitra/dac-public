#include <iostream>

using namespace std;

int main()
{
    int* x = new int(5);

    cout << "The Pointer " << x << " points to " << *x << endl;
    delete []x;
    cout << *x ;    // Memory Freed
    return 0;
}

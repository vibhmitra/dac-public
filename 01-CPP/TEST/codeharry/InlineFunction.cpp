#include <iostream>
using namespace std;

inline int product(int x, int y) {
    return x*y;
}


int main()
{
    int a, b;
    cout << "Enter a, b > ";
    cin >> a >> b;
    cout << product(a,b) << endl;
}

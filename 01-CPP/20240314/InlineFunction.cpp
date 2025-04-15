#include <iostream>

using namespace std;

inline void maximum (int a, int b)
{
    cout << "MAX: " << (a>b)? a : b;
}

int main()
{
    int x = 10;
    int y = 2;

    maximum(x, y);
}

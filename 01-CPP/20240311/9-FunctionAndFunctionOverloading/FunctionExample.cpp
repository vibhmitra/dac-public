#include <iostream>

using namespace std;

void display(void)
{
    cout << "C-DAC Delhi" << endl;
}

float Add(float x, float y)
{
    return (x + y);
}
float Maximum(int x, int y, int z)
{
    if (x > y && x > z)
        return (x);
    else if (y > z)
        return (y);
    else
        return (z);
   // return ((a>))
}

int main()
{
    display();
    cout << "ADD: " << Add(5.5, 4.5) << endl;
    cout << "MAX: " << Maximum(2,6,3) << endl;
    return (0);
}

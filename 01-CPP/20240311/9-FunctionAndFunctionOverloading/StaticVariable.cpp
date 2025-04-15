#include <iostream>

using namespace std;

static int numStaticOutside = 20;

void showValue(void)
{
    int numNonStatic = 10;
    static int numStatic = 10;

    numNonStatic++;
    numStatic++;
    numStaticOutside++;

    cout << "Non-Static     : " << numNonStatic << endl;
    cout << "Static         : " << numStatic << endl;
    cout << "StaticOutside  : " << numStaticOutside << endl;
    cout << endl;

    return;
}

int main()
{
    showValue();
    showValue();
    showValue();
    showValue();

    return 0;
}

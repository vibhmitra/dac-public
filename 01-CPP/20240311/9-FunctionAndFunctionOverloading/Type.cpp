#include <iostream>

using namespace std;

void display(void)
{
    cout << "C-DAC Delhi" << endl;
}

int Add(float x, float y)
{
    return (x + y);     // Function will Always return value of ITS TYPE Defined Irrespective of the Parameter Passed through IT.
}


int main()
{
    display();
    cout << "ADD: " << Add(5.5f, 4.8) << endl;
    return (0);
}

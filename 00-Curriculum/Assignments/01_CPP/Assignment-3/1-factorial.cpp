/* Problem 1    */
#include <iostream>

using namespace std;

int main()
{
    int             numInput;
    long long int   factorial = 1;  // presetting the value of variable 1, cuz 0 makes everything zero.

    cout << "Enter a number that you want factorial for : ";
    cin >> numInput;

    for (int i = 1; i <= numInput; i++)
    {
        factorial *= i;
    }

    cout << numInput << "! = " << factorial << endl;
    return 0;
}

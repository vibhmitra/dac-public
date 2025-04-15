/* Problem 3 - Cal sum of four decimal. */
#include <iostream>

using namespace std;

int main()
{
    float a, b, c, d, sum, avg;

    cout << "Enter First Number: ";
    cin >> a;
    cout << "Enter Second Number: ";
    cin >> b;
    cout << "Enter Third Number: ";
    cin >> c;
    cout << "Enter Forth Number: ";
    cin >> d;

    sum = a + b + c + d;

    cout<<"Sum = "<< sum << endl;
    cout<<"Avg = "<< sum / 4;

    return 0;
}

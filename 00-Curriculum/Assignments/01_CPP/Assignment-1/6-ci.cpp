/* Problem 6 : Program to cal compound intrest */
#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    double principal, rate, period, compoundInterest;

    cout << "Enter Pricipal Amount : ";
    cin >> principal;
    cout << "Enter Rate : ";
    cin >> rate;
    cout << "Time (years) : ";
    cin >> period;

    compoundInterest = ((principal)*pow((1 + (rate / 100)), period)) - principal;   // formula for CI
    cout << "Total Compound Interest : " << compoundInterest;
    return 0;
}

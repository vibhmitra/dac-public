/* Problem 5 - Tax according to new regime. */
#include <iostream>

using namespace std;

int main()
{
    float income, tax;

    cout << "Enter Income > ";
    cin >> income;

    if (income < 300000)
    {
        cout << "Total Income : " << income << endl;
        cout << "Total Tax on Income (0%) : NIL" << endl;
    }
    if (income >= 300001 && income <= 600000)
    {
        cout << "Total Income : " << income << endl;
        tax = income * 0.05;
        cout << "Total Tax on Income (5%) : " << tax << endl;
        cout << "Net Income : " << income - tax;
    }
    if (income >= 600001 && income <= 900000)
    {
        cout << "Total Income : " << income << endl;
        tax = income * 0.10;
        cout << "Total Tax on Income (10%) : " << tax << endl;
        cout << "Net Income : " << income - tax;
    }
    if (income >= 900001 && income <= 1200000)
    {
        cout << "Total Income : " << income << endl;
        tax = income * 0.15;
        cout << "Total Tax on Income (15%) : " << tax << endl;
        cout << "Net Income : " << income - tax;
    }
    if (income >= 1200001 && income <= 1500000)
    {
        cout << "Total Income : " << income << endl;
        tax = income * 0.20;
        cout << "Total Tax on Income (20%) : " << tax << endl;
        cout << "Net Income : " << income - tax;
    }
    if (income > 1500000)
    {
        cout << "Total Income : " << income << endl;
        tax = income * 0.30;
        cout << "Total Tax on Income (30%) : " << tax << endl;
        cout << "Net Income : " << income - tax;
    }

    return 0;
}

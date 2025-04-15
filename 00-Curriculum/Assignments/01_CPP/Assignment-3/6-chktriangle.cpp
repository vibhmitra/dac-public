/* Problem 6    */
/*
    sample data to test:
    1. (3, 4, 5)
    2. (5, 12, 13)
    3. (8, 15, 17)
    4. (7, 24, 25)
    5. (9, 40, 41)
    6. (11, 60, 61)
    7. (12, 35, 37)
    8. (13, 84, 85)
    9. (16, 63, 65)
    10. (20, 21, 29)        */

#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int sideA, sideB, sideC;
    int hypoA, hypoB, hypoC;

    cout << "Enter Sides of Triangle > " << endl;
    cout << "Enter Side 1 : ";
    cin >> sideA;
    cout << "Enter Side 2 : ";
    cin >> sideB;
    cout << "Enter Side 3 : ";
    cin >> sideC;

    hypoA = (sqrt(pow(sideB, 2) + pow(sideC, 2)));
    hypoB = (sqrt(pow(sideA, 2) + pow(sideC, 2)));
    hypoC = (sqrt(pow(sideA, 2) + pow(sideB, 2)));

    if (sideA == hypoA || sideB == hypoB || sideC == hypoC)
    {
        cout << "YEP! IT'S A RIGHT-ANGLED TRIANGLE!" << endl;
    }
    else
    {
        cout << "NOT A RIGHT ANGLED TRIANGLE! " << endl;
    }
    return (0);
}

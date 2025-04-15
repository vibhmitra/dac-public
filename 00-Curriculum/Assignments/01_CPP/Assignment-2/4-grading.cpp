/* Problem 4: grading. */
#include <iostream>

using namespace std;

int main()
{
    int marks, totalMarks, percentage;

    totalMarks = 0;
    for (int iTemp = 1; iTemp <= 5; iTemp++)
    {
        cout << "Enter Marks in Subject " << iTemp << " : ";
        cin >> marks;
        totalMarks += marks;
    }
    percentage = totalMarks / 5;
    cout << "Total Marks is " << totalMarks << endl;
    cout << "Percentage is " << percentage << "%" << endl;

    if (percentage >= 75)
    {
        cout << "Grade : A." << endl;
    }
    else
    if (percentage >= 65 && percentage <= 74)
    {
        cout << "Grade : B." << endl;
    }
    else
    if (percentage >= 55 && percentage <= 64)
    {
        cout << "Grade : C." << endl;
    }
    else
    if (percentage >= 45 && percentage <= 54)
    {
        cout << "Grade : D." << endl;
    }
    else
        cout << "Fail." << endl;

    return 0;
}

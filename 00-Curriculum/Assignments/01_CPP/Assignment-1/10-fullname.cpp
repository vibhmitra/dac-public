/* Problem 10: Program that takes First, middle, and last name, and print them in one go. */
#include <iostream>

using namespace std;

int main()
{
    string firstName, middleName, lastName, fullName;
    cout << "Enter your First Name : ";
    getline(cin, firstName);

    cout << "Enter your Middle Name : ";
    getline(cin, middleName);

    cout << "Enter your Last Name : ";
    getline(cin, lastName);

    fullName = firstName + ' ' + middleName + ' ' + lastName;

    cout << "Welcome, " << fullName << " !!!";
    return 0;
}

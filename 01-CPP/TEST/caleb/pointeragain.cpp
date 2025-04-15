#include <iostream>

using namespace std;


int main()
{
    int age = 19;
    double gpa = 4.5;
    string name = "Mike";

    int* pAge = &age;
    double* pGpa = &gpa;
    string* pName = &name;

    cout << pAge << '\n';
    cout << *pAge << '\n'; // dereferencing the pointer.
    cout << *(&gpa) << '\n'; // dereferencing the referencing.
}

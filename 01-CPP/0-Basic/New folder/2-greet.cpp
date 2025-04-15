/* Getting a Age and Name, Fathers Name, Mothers Name */
#include <iostream>

using namespace std;

int main()
{
    // Declaration
    int age;
    string name;

    cout << "Enter Age: ";
    cin >> age;
    cout << "Enter Name: ";
    cin >> name;        // Using simple CIN to get values in string.
    /* Drawbacks
    When we use `cin` to get input, as soon as we type space char, it terminates taking input and
    will move to the next instruction.
    */
    cout << "Hey! " << name << " You are " << age << " year old." << endl;
    return 0;
}


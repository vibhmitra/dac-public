/*Problem 2: To Print name entered by you. */

#include <iostream>
using namespace std;
int main()
{
    string name;
    cout << "Enter your name: ";
    getline(cin, name);
    cout << name << endl;
    return 0;
}

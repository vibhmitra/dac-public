/* Problem 2  */
#include <iostream>
#include <string>

using namespace std;

int main()
{
    string userString;  // init

    // getting string
    cout << "Enter a String  : ";
    getline(cin, userString);

    // printing in reverse
    cout << "Reversed String : ";
    for (int i = userString.length() - 1 ; i >= 0; i--)
    {
        cout << userString[i];
    }
    cout << endl;
    return 0;
}

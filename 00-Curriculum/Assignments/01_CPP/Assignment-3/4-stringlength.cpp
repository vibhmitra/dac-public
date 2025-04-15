/* Problem 4 */
#include <iostream>

using namespace std;

int main()
{
    string userString;
    int stringLength;

    // input
    cout << "Enter a String : ";
    getline(cin, userString);

    for (stringLength = 0; userString[stringLength] != '\0'; stringLength++);
    cout << "The Size of the String is : " << stringLength << endl;

    return 0;
}

#include <iostream>

using namespace std;

int main()
{
    string s;
    string t;

    char *ptr;
    ptr = char(&s);

    cin >> s;
    cin >> t;

        cout << "&s: " << &s << endl;
        cout << "&t:" << &t << endl;

        cout << ptr;


}

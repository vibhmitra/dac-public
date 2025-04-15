#include <iostream>

using namespace std;

int main()
{
    string str0 = "Hello" ;
    string::iterator i;
    for (i = str0.begin(); i != str0.end(); i++)
    {
        cout << *i  ;
    }

    cout << endl;

    string str1 = "Mello";
    string::reverse_iterator r;
    for (r = str1.rbegin(); r != str1.rend(); r++)
    {
        cout << *r  ;
    }

}

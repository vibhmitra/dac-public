#include <iostream>
using namespace std;
int main()
{
    string name;
    cout<<"Enter your name: ";
    cin.ignore(5);  // ignores the next 5 strokes.
    getline(cin, name);
    cout<<name<<endl;
    return 0;
}

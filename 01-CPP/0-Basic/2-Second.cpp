#include <iostream>
using namespace std;
int main()
{
    // Declare the age variable.
    int age;
    string name;
    cout<<"Second Program!\n";
    cout<<"C++ "<<"Programming "<<"C-DAC."<<endl;

    cout<<"Enter your age:";
    cin >> age;
    cin.ignore();
    cout<<"Enter your name:";
    //cin>>name;
    getline(cin, name);
    cout<<"Welcome, "<<name<<"! you are "<<age<<" years old."<<endl;
    return 0;
}

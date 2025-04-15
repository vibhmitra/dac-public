#include <iostream>
using namespace std;
int main()
{
    char name[5];
    cout<<"Enter your name: ";
    cin.ignore(1);
    cin.read(name, 4);
    cout<<name<<endl;
    return 0;
}

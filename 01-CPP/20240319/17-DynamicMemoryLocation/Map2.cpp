#include <iostream>
#include <map>
using namespace std;

int main()
{
    map<int, string> employee;

    employee[101] = "A";
    employee[102] = "B";
    employee[103] = "C";
    employee[104] = "D";
    employee[105] = "E";

    //cout << employee[1,0] << endl;

    map<int, string> :: iterator itr;
    for (auto itr = employee.begin(); itr != employee.end(); itr++) {
        cout << itr->first << " " << itr->second << endl;
    }
}

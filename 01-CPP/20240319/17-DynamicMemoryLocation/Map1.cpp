#include <iostream>
#include <map>
#include <vector>
using namespace std;

int main()
{
    map<int, vector<string>> employee;

    employee[101] = {"dd","ss"};
//    employee[102] = "B";
//    employee[103] = "C";
//    employee[104] = "D";
//    employee[105] = "E";

//    cout << employee[101] << endl;

//    map<int, string> :: iterator itr;
//    for (auto itr = employee.begin(); itr != employee.end(); itr++) {
//        cout << itr->first << " " << itr->second << endl;
//    }

    // using for-each loop
    for (auto i : employee) {
        cout << i.first << " " << i.second << endl;
    }
}

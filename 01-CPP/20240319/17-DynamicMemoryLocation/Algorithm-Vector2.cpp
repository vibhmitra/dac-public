#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
    vector<int> vec = {10,20,30,40,50};

    cout << "SIZE : " << vec.size() << endl;
    vec.push_back(90);
    cout << "SIZE : " << vec.size() << endl;
    cout << "CAPACITY : " << vec.capacity() << endl;    // capacity of vector is dynamic
    cout << "max_size : " << vec.max_size() << endl;    // max size of vector
    cout << "at(4) : " << vec.at(4) << endl;  // show value that is at index 4

    cout << "front : " << vec.front() << endl;
    cout << "back : " << vec.back() << endl;


    vector<int> vec2;

    // pushing data
    for (auto i=0; i < 10; i++) {
        vec2.push_back(i);
    }

    // fwd
    for (auto i = vec2.begin(); i != vec2.end(); i++ ) {
        cout << *i << " " ;
    }

    cout << endl;
    // reverse
    for (auto i = vec2.rbegin(); i != vec2.rend(); i++ ) {
        cout << *i << " " ;
    }


}

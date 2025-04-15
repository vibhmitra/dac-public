#include <iostream>
using namespace std;

class Course {
public:
    void operator() (string s1, string s2) {
        cout << "C++ " << s1 << endl << s2;
    }

};

int main()
{
    Course course;
    course("Programming", "");       // object will work as function
    return (0);
}

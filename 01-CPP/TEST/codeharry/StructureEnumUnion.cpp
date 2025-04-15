#include <iostream>
using namespace std;

// Structure is user defined datatype.
struct employee
{
//    data
    int eID;
    char favChar;
    float salary;
};

typedef struct shape
{
    string type;
    string color;
} sh;

// union will share memory.
// we can only use ONE of the data inside it.
// it saves memory.
union money {
    int rice;   // 4
    char car;   // 1
    float pounds; // 4
};


// Enum
//is used to define userdefined constand
enum Meal { breakfast, lunch, dinner};
//              ^       ^       ^
//              0       1       2
int main() {
    struct employee vibh;
    vibh.eID = 1;
    vibh.favChar = 'V';
    vibh.salary = 10020;

    struct employee anand;
    anand.eID = 2;
    anand.favChar = 'A';
    anand.salary = 23334;

    cout << vibh.eID << '\t' << vibh.salary;

    sh circle;  // typedef is used to shorten the name.
    circle.type = "Circle";
    circle.color = "yellow";

    cout << endl;
    union money m1;
    m1.rice = 34;
    cout << m1.rice;
    m1.car = 'C';
    cout << m1.rice;


    // enum
    cout << endl;
    Meal food = lunch;
    cout << food;

    return 0;
}

#include <iostream>
using namespace std;

class ClassName {
private:
    int a, b, c;

public:
    int d, e;

    void setData(int x, int y, int z);
    void getData(void);
};


void ClassName::getData(void)
{
    cout << a << endl << b << endl << c;
}

void ClassName::setData(int a1, int b1, int c1)
{
    a = a1;
    b = b1;
    c = c1;
}


int main()
{
    ClassName classObject;
    classObject.setData(2,4,5);
    classObject.getData();

    ClassName c;
//    c.a = 43;
//    c.b = 34;
//    c.c = 28;

}

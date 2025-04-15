#include <iostream>

using namespace std;

class A
{
    public:
        void abc()
        {
            cout << "Function Inside A Called\n";
        }
};

class B : public A
{
    public:
        void abc()
        {
            cout << "Function Inside B Called\n";
        }
};



int main()
{
    B cc;

    A *Obj = &cc;
    Obj = new B();

    //cout << ptrObjA -> abc() << endl ;
    cc.abc();
    Obj -> abc();

    return 0;
}

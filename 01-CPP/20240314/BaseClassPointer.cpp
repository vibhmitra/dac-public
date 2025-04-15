#include <iostream>

using namespace std;

class A
{
    public:
        int abc()
        {
            cout << "Function Inside A Called\n";
            return 0;
        }
};

class B : public A
{
    public:
        int abc()
        {
            cout << "Function Inside B Called\n";
            return 1;
        }
};



int main()
{
    A *ptrObjA = new B();  // Making Object Pointer of class type A | Base Class Object can only Access Function from Base Class Only
    B *ptrObjB = new B();  // Making Object Pointer of class type B

//  A *ptrObjA = new A();   // POSSIBLE | DOWNNCASTING
//  B *ptrObjB = new A();   // NOT POSSIBLE | UPCASTING

    cout << ptrObjA -> abc() << endl ;      // This will call function from class 'A' cuz' the Pointer is for CLASS 'A'.
    cout << ptrObjB -> abc() << endl;

    return 0;
}

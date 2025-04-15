#include <iostream>

using namespace std;

class A
{
    public:
    void showA()
    {
        cout << "Function in A\n";
    }
};

class B : public A
{
    public:
    B()
    {
        cout << "Constructor B\n";
    }
};

class C : public A
{
    public:
    C()
    {
        cout << "Constructor C\n";
    }
};

class D : public B, public C
{
    public:
    D()
    {
        cout << "Constructor D\n";
    }
};


int main()
{
    D obj;
    obj.B::showA();
    obj.C::showA();


}

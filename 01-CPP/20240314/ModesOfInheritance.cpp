#include <iostream>

using namespace std;
/*

class A
{
    private:
        int x = 1;

    protected:
        int y = 2;
    public:
        int z = 3;
        void printValueA()
        {
            cout << "value of x : " << x << endl;
            cout << "value of y : " << y << endl;
            cout << "value of z : " << z << endl;
        }
};

class B : public A
{
    public:
        void printValueB()
        {
          //cout << "value of x : " << x << endl;
            cout << "value of y : " << y << endl;
            cout << "value of z : " << z << endl;

        }
};

class C : protected A
{
    public:
        void printValueC()
        {
         // cout << "value of x : " << x << endl;
            cout << "value of y : " << y << endl;
            cout << "value of z : " << z << endl;

        }
};

class D : private A
{
    public:
        void printValueD()
        {
        //  cout << "value of x : " << x << endl;
            cout << "value of y : " << y << endl;
            cout << "value of z : " << z << endl;

        }
};
*/
class A {
public:
    void show() {
        cout<<"A";
    }
};
class B: public classA {};
public:
    void display() {
        cout<<"B";
    }
};

int main()
{
  //  D objD;
   // objD.printValueD();

}

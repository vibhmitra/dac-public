#include <iostream>

using namespace std;
/* GETTER / SETTER -->>> */


// BASE CLASS | SUPER CLASS | PARENT CLASS
class BaseClass
{
    private:
        int length, breadth;

    public:
        // Validation
        void setLength(int l)
        {
            if (l > 0)
                length = l;
            else
                cout << "Length Can't Be Negative." << endl;
        }

        void setBreadth(int b)
        {
            if (b > 0)
                breadth = b;
            else
                cout << "Breadth Can't Be Negative." << endl;
        }

        void area()
        {
            cout << "Area : " << (length * breadth);
        }

};

/*
// CHILD | SUB | DERIVED CLASS
class ChildClass : public BaseClass
{
    public:
        int height;
        int Volume() { return (height); }
};*/

int main()
{
    BaseClass *ChildObj = new BaseClass();
    int l, b;

    cout << "L: ";
    cin >> l;
    cout << "B: " << endl;
    cin >> b;

    ChildObj -> setLength(l);
    ChildObj -> setBreadth(b);

    ChildObj -> area();

    return 0;

}

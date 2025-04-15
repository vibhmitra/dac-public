#include <iostream>

using namespace std;

class Shape
{
    public:
        virtual void area() = 0;
        virtual void perimeter() = 0;
};

class Circle : public Shape
{
    private:
        int radius;
    public:


        Circle(int r)
        {
            radius = r;
        }

        void area()
        {
            cout << "Area: " << (3.14)*(radius)*(radius) << endl;
        }

        void perimeter()
        {
            cout << "Circu: " << 2*(3.14)*(radius) << endl;
        }
};

class Rectangle : public Shape
{
    private:
        int length, bredth;
    public:

        Rectangle(int l, int b)
        {

            length = l;
            bredth = b;
        }

        void area()
        {
            cout << "Area: " << (length) * (bredth) << endl;
        }

        void perimeter()
        {
            cout << "Perim: " << ((length)+(bredth)) * 2 << endl;
        }
};

int main()
{
    Shape *ptrC = new Circle(4);
    ptrC -> area();
    ptrC -> perimeter();

    Shape *ptrR = new Rectangle(3, 4);
    ptrR -> area();
    ptrR -> perimeter();
}

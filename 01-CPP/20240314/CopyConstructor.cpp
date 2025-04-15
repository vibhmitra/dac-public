#include <iostream>

using namespace std;

class Rectangle
{
    private:
        int length, breadth;

    public:
        // first constructor
        Rectangle(int len, int width)
        {
            length = len;
            breadth = width;
        }

    //  Rectangle (int len, int width) : length(len), breadth(width) {} THIS WILL ALSO WORK

        // second constructor
        Rectangle(Rectangle &rec)
        {
            length = rec.length;
            breadth = rec.breadth;
        }

        void Display()
        {
            cout << "Length : " << length << endl;
            cout << "Breadth : " << breadth << endl;
        }
};



int main()
{
    Rectangle rec1(10, 2);  // first constructor call
    rec1.Display();

    Rectangle rec2(rec1); // second constructor call
    rec2.Display();
}

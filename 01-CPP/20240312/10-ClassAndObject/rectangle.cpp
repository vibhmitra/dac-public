#include <iostream>

using namespace std;

class Rectangle
{
    public:
        int length, breadth;
        void getData();
        int areaRec();
        int perimeterRec();
};

void Rectangle::getData()
{
    cout << "Length: ";
    cin >> length;
    cout << "Breadth: ";
    cin >> breadth;
}

int Rectangle::areaRec() { return (length * breadth); }

int Rectangle::perimeterRec() { return (2 * (length + breadth)); }

int main()
{
    Rectangle recObj;

    recObj.getData();
    cout << "AREA: " << recObj.areaRec() << endl;
    cout << "PERIMETER: " << recObj.perimeterRec() << endl;

    return 0;
}

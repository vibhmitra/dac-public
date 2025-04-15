#include <iostream>

using namespace std;

class Marks
{
    private:
        int m1, m2;
    public:
        void show();
        void getData();
        void displayData();
};

void Marks::getData()           // we are using scope resolution operator to access the function inside class 'Marks';
{
    cout << "Enter the Marks 1: ";
    cin >> m1;
    cout << "Enter the Marks 2: ";
    cin >> m2;
    return;
}

void Marks::displayData()
{
    cout << "Marks 1: " << m1 << endl;
    cout << "Marks 2: " << m2 << endl;
    return;
}

int main()
{
    Marks marksObj;             // creating object
    marksObj.getData();
    marksObj.displayData();
    return 0;
}

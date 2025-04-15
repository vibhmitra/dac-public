#include <iostream>

using namespace std;

// Template Functions
template <class T>
void swapping(T &a, T &b)
{
    T temp;
    temp = a;
    a = b;
    b = temp;
}

template <typename T>               // If Class is not given we can use 'typename'
T abs(T a) { return (a >= 0 ? a : -a); }



int main()
{
    int x = 400, y = 300;

    swapping(x, y);
    cout << "Int X : " << x << endl;
    cout << "Int Y : " << y << endl;

    float p = 40.90, q = 5.354;

    swapping(p, q);
    cout << "Float P : " << p << endl;
    cout << "Float Q : " << q << endl;

    cout << "Absolute Value : " << abs(2324.23423) << endl;
    cout << "Absolute Value : " << abs(-5) << endl;

}

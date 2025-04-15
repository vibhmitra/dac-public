#include <iostream>


using namespace std;

class Complex
{
    private:
        int real, img ;

    public:
        Complex(int r = 0, int i = 0)
        {
            real = r ;
            img = i ;
        }

        friend ostream& operator << (ostream &ost, Complex &comp);  // Using friend function Overloading << operator.
};

ostream& operator << (ostream &ost, Complex &comp)  // Overloading Operator
{
    ost << comp.real << " + i" << comp.img; // ost is object of ostream thats why cout is not used.
    return ost;
}


int main()
{
    Complex Comp1(3, 4);
    cout << Comp1 ; // Extraction operator overloaded

    return 0;

}

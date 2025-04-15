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

        Complex Add(Complex &objComplex)               // here we want to return complex
        {
            Complex temp;
            temp.real = real + objComplex.real ;
            temp.img = img + objComplex.img ;
            return (temp);
        }

        void DisplayComplex()
        {
            cout << real << " + i" << img << endl ;
        }
};

int main()
{
    Complex Comp1(3, 4);
    Comp1.DisplayComplex();

    Complex Comp2(9, 5);
    Comp2.DisplayComplex();

    Complex Comp3;
    Comp3 = Comp1.Add(Comp2);
    Comp3.DisplayComplex();

    return 0;

}

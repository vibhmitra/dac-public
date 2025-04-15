#include <iostream>

using namespace std;

class Count
{
    private:
        int Value ;
    public:
        Count(int x = 0)
        {
            Value = x ;
        }

        void operator ++ (void)        // // For Pre Increment
        {
            ++Value;
            return;
        }

        value operator ++ (int)      // For Post Increment
        {
            ++Value;
        }
/*
        Count operator ++ ()
        {
            Count obj;
            obj.
        }
*/
        void displayValue()
        {
            cout << "Value of Count : " << Value << endl;
        }
};


int main()
{
    Count objC1(4);
    objC1.displayValue();

    ++objC1;
    objC1.displayValue();

    objC1++;
    objC1.displayValue();

    Count o(1);
    ++o;
    o.displayValue();

    return 0;

}

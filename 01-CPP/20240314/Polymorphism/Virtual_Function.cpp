#include <iostream>

using namespace std;

class Bank
{
    public:
        virtual void homeLoanInterest()
        {
            cout << "Home Loan Interest b/w 5 to 12%.\n";
        }
};

class SBI : public Bank
{
    public:
        void homeLoanInterest()
        {
            cout << "Home Loan Interest b/w 10 to 11%.\n";
        }
};

int main()
{
    Bank *ptr = new SBI();
    ptr -> homeLoanInterest();

    SBI sbi;
    sbi.homeLoanInterest();

}

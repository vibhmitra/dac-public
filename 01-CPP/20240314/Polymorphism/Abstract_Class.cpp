#include <iostream>

using namespace std;

class Bank      // <-- ABSTRACT CLASS
{
    public:
        int x = 102;
        virtual void homeLoanInterest()
        {
            cout << "Home Loan Interest b/w 5 to 12%.\n";
        }

        virtual void educationLoan() = 0;   // Pure Virtual Function
};

class SBI : public Bank
{
    public:
        void homeLoanInterest()
        {
            cout << "Home Loan Interest b/w 10 to 11%.\n";
        }

        void educationLoan()
        {
            cout << "Education Loan is 7% \n";
        }
};

int main()
{
    Bank *ptr = new SBI();
    ptr -> homeLoanInterest();

    SBI sbi;
    sbi.homeLoanInterest();

    // Bank o;
    // o.educationLoan(); <-- NOT ALLOWED

    ptr -> educationLoan();

    cout << ptr -> x;
}

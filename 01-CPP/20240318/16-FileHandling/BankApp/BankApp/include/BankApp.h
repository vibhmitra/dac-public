#ifndef BANKAPP_H
#define BANKAPP_H


class BankApp
{
private:
    long accountNumber;
    char name[100];

public:
    BankApp();

    // function declaration
    void menuItem();
    void addNewCustomer();
    void delCustomer();

};

#endif // BANKAPP_H

#include <iostream>
#include <fstream>
#include "BankApp.h"
using namespace std;

BankApp::BankApp()
{
    menuItem();
}

void BankApp::menuItem()
{
    char ch;
    int menuOption;

    do
    {
        cout << "BANK APP" << endl;
        cout << "\t1. ADD NEW CUSTOMER\n"
             << "\t2. \n"
             << "\t5. Exit\n";
        // switch code
        cin >> menuOption;
        switch(menuOption) {
            case 1: addNewCustomer();
                break;
            case 2: delCustomer();
                break;
            case 5: exit(0);
        }

        cout << "Continue? (Y/N) > ";
        cin >> ch;

    } while (ch == 'Y' || ch == 'y');
}

void BankApp::addNewCustomer()
{
    cin.getline(name, 100);
    cin >> accountNumber;

    cout << name << endl;
    cout << accountNumber << endl;

    ofstream ofs;
    ofs.open("bank.txt", ios::out|ios::trunc);
    ofs << name;
    ofs << accountNumber;

    ofs.close();


}

void BankApp::delCustomer()
{   string line;
    ifstream ifs;
    ifs.open("bank.txt", ios::in);

    if (ifs.is_open()) {
        while (getline(ifs, line)) {
            cout << line ;
        }
        ifs.close();
    }

}

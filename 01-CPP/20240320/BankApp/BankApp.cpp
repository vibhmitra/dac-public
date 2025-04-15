#include <iostream>
#include <fstream>
#include <vector>
#include <map>
#define MIN_BALANCE 500;
using namespace std;

class Account {
private:
    long accountNumber;
    string firstName, lastName;
    float balance;
    static long nextAccountNumber;

public:
    Account() {};
    Account(string  fname, string lname, float bankBalance);
    long getAccountNo() { return accountNumber; }
    string getFirstName() { return firstName; }
    string getLastName() { return lastName; }
    float getBalance() { return balance; }

    float withdraw(float ammount);
    void deposit(float amount);
    static void setLastAccountNumber(long accountNumber);
    static long getLastAccountNumber();


    // OPERATOR OVERLOAD
    friend ofstream & operator << (ofstream&, Account&);
    friend ifstream & operator >> (ifstream&, Account&);
    friend ostream & operator << (ostream&, Account&);
};

long Account::nextAccountNumber = 1000;

class Bank {
private:
    map<long, Account> mapAccount;

public:
    Bank(){};
    Account openAccount(string firstName, string lastName, float amount);
    Account showBalance(long accountNumber, float amount);
    void closeAccount(long accountNumber);
    void showAllAccounts();
};

int main()
{
    Bank bank;
    Account acc;
    string fname, lname;
    long accountNumber;
    float balance, amount;

    int menuItem;

    cout << ":: BANK APP :: " << endl;
    do
    {
        cout << "SELECT OPTIONS > \n";
        cout << "\t1. OPEN NEW A/C.\n"
             << "\t2. CHECK BALANCE.\n"
             << "\t3. DEPOSIT.\n"
             << "\t4. WITHDRAWAL.\n"
             << "\t5. CLOSE A/C.\n"
             << "\t6. DISPLAY ALL A/C.\n"
             << "\t7. EXIT.\n\n";
        cout << "Enter Choice : ";
        cin >> menuItem;

        switch(menuItem) {
            case 1:
                cout << "FIRST NAME : ";
                cin >> fname;
                cout << "LAST NAME : ";
                cin >> lname;
                cout << "AMOUNT : ";
                cin >> balance;
                acc = bank.openAccount(fname, lname, balance);
                cout << "ACCOUNT OPENED SUCCESSFULLY." << endl;
                cout << acc;
                break;

            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                exit(0);
                break;
            default:
                cout << "WRONG CHOICE!";
                exit(0);
                break;
        }

    } while(menuItem != 7);

    return 0;
}
/* End of Main */

Account::Account(string  fname, string lname, float bankBalance)
{
    nextAccountNumber++;
    accountNumber = nextAccountNumber;
    firstName = fname;
    lastName = lname;
    balance = bankBalance;
}

Account Bank::openAccount(string firstName, string lastName, float amount)
{
    ofstream ofs;
    Account account(firstName, lastName, amount);
    mapAccount.insert(pair<long, Account>(account.getAccountNo(), account));

    ofs.open("bank.txt", ios::app);
    map<long, Account>:: iterator itr;
    for (itr = mapAccount.begin(); itr != mapAccount.end(); itr++)
    {
        ofs << itr->second;
    }
    ofs.close();

    return account;
}


//Bank::Bank()
//{
//    Account acc;
//    ifstream ifs("bank.txt", ios::in);
//
//    while (!ifs.eof()) {
//        ifs >> acc;
//        mapAccount.insert(pair<long, Account>(acc.getAccountNo(), acc));
//    }
//}

ofstream & operator << (ofstream& ofs, Account& ac)
{
    ofs << ac.accountNumber << endl;
    ofs << ac.firstName << endl;
    ofs << ac.lastName << endl;
    ofs << ac.balance << endl;
    return ofs;
}

ifstream & operator >> (ifstream& ifs, Account& ac)
{
    ifs >> ac.accountNumber;
    ifs >> ac.firstName;
    ifs >> ac.lastName;
    ifs >> ac.balance;
    return ifs;
}

ostream & operator << (ostream& os, Account& ac)
{
    os << "\tA/C NO\t: " << ac.getAccountNo() << endl;
    os << "\tFIRST NAME\t: " << ac.getFirstName() << endl;
    os << "\tLAST NAME\t: " << ac.getLastName() << endl;
    os << "\tBALANCE\t: " << ac.getBalance() << endl;
    return os;
}






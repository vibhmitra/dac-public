#include <iostream>
#include <string>
using namespace std;

class Binary {
private:
    string s;

public:
    void read();
    void chk_bin();
    void ones();
    void display();
};

void Binary :: read()
{
    cout << "Enter Binary : ";
    cin >> s;
    chk_bin();
}

void Binary :: chk_bin()
{
    for (int i = 0; i < s.length(); i++) {
        if (s.at(i) != '0' && s.at(i) != '1') {
            cout << "Incorrect Binary Format." << endl;
            exit(0);
        }
    }
    cout << "Correct Binary Format. \n";
}

void Binary :: ones()
{
    for (int i = 0; i < s.length(); i++) {
        if (s.at(i) == '1') {
            s.at(i) = '0';
        }
        else {
            s.at(i) = '1';
        }
    }
}

void Binary :: display() {
    cout << s << endl;
}


int main()
{
    Binary b;
    b.read();
    b.display();
    b.ones();
    b.display();
}

#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    fstream fst;
    fst.open("data/tg-tp-sg-sp.txt", ios::in | ios::in);

    // Find the Current Position
    cout << "Current Position : " << fst.tellg() <<endl;        // output = 0

    // MOVING the get pointer to 5 bytes ahead
    fst.seekg(9, ios::beg);
    cout << fst.tellg() << endl;

    // Printing the 9th Position Char From the File
    char ch = fst.get();
    cout << ch;

    cout << fst.tellp();


    return 0;
}

#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    fstream fst("data/seekpseekg.txt", ios::out|ios::in);
    fst << "HELLO THERE!" << endl;

    // we have to change the position of pointer seek
    fst.seekp(6);           // Seeking pointer position=6 for putting data.
    fst << "HUMAN !! ";    // will replace the original contents at position 6


    //fst.close();

    //fst.open("data/seekpseekg.txt", ios::in);

    fst.seekg(0);       // seeking get pointer to position 0 for getting the data.

    string line;
    while (fst.good()) {
        getline(fst, line);
        cout << line << endl;
    }

    fst.close();

    return 0;
}

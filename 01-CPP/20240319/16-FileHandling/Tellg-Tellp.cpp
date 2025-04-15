#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ofstream ofs;
    ofs.open("data/tellgtellp.txt", ios::out);
//    using put pointer to get pointer position
    cout << "Before Reading the Position of Put Pointer > " << ofs.tellp() << endl;
    ofs << "C_DAC Delhi" << endl;
    cout << "After Reading the Position of Put Pointer > " << ofs.tellp() << endl;
    ofs.close();

    ifstream ifs;
    ifs.open("data/tellgtellp.txt", ios::in);   // file in reading mode
    cout << "Before Reading Position of Get Pointer : " << ifs.tellg() << endl;
    int pos = 0;
    char x;
    while(pos < 5) {
        ifs >> x;
        cout << x;
        pos++;
    }
    return 0;
}

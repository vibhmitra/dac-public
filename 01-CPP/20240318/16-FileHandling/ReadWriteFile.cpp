#include <iostream>
#include <fstream>          // This works for both input and out stream for file
using namespace std;

int main()
{
    string filePath = "G:\\CDAC\\Curriculum\\2-Practice\\C++\\20240318\\16-FileHandling\\data\\ReadWriteFile.txt";

    // Writing to a file.
    ofstream ofs;
    ofs.open(filePath, ios::app);
    ofs.open(filePath, ios::app);

    ofs << "Added Using Append! \n";
    ofs << "This is file handling in C++! \n";
    ofs.close();


    // Reading from a file
    string line;
    ifstream ifs;
    ifs.open(filePath);     // here ios::in is optional.
    if (ifs.is_open()) {
        while (getline(ifs, line)) {
            cout << line ;
        }
        ifs.close();
    }

    return 0;
}



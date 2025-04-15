#include <iostream>
#include <fstream>          // This works for both input and out stream for file
using namespace std;

int main()
{   string filePath = "G:\\CDAC\\Curriculum\\2-Practice\\C++\\20240318\\16-FileHandling\\data\\myFile2.txt";

    // through constructor via making obj.
    fstream fst(filePath, ios::app);

    fst << "Centre for Development of Advanced Computing.\n";
    fst << "Centre for Development of Advanced Computing.\n";
    fst << "Centre for Development of Advanced Computing.\n";
    fst << 101 << endl; // put
    fst.close();

    return 0;
}

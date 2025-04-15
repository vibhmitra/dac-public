#include <iostream>
#include <fstream>          // This works for both input and out stream for file
using namespace std;

int main()
{
    string filePath = "G:\\CDAC\\Curriculum\\2-Practice\\C++\\20240318\\16-FileHandling\\data\\myFile3.txt";

    fstream fst;    // creating object for fstream class.

    fst.open(filePath, ios::out);
//    fst.open("/data/myFile4.txt", ios::out);      // this is working
//    fst.open("\\data\\myFile4.txt", ios::out);    // when giving windows like path is not working

    // Checking weather file is opened successfully.
    if (!fst) {
        cout << "Error in Creating File! \n";
        return 0;
    }

    cout << "File Created Successfully! \n";

    //fst.write()

    fst.close();

    return 0;
}

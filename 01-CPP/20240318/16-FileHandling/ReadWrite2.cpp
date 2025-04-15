#include <iostream>
#include <fstream>          // This works for both input and out stream for file
using namespace std;

class Student   {
public:
    string stuName;
    int stuRollNo;
    string branchName;

    Student() {};
    Student(string n, int rn, string bn) {
        stuName = n;
        stuRollNo = rn;
        branchName = bn;
    }

    friend ofstream &operator <<(ofstream &ofs, Student s);
    friend ifstream &operator >>(ifstream &ifs, Student &s);

};

ofstream &operator <<(ofstream &ofs, Student s)
{
    ofs << s.stuName << endl;
    ofs << s.stuRollNo << endl;
    ofs << s.branchName << endl;
}

ifstream &operator >>(ifstream &ifs, Student &s)
{
    ifs >> s.stuName >> s.stuRollNo >> s.branchName;
    return ifs;
}

int main()
{
    string filePath = "G:\\CDAC\\Curriculum\\2-Practice\\C++\\20240318\\16-FileHandling\\data\\ReadWriteFile2.txt";
    string stName, brName;
    int rollNo;
    cout << "Enter Name : "; cin >> stName;
    cout << "Enter Roll : "; cin >> rollNo;
    cout << "Enter Branch : "; cin >> brName;

    Student s0(stName, rollNo, brName);
    ofstream ofs(filePath, ios::app);
    ofs << s0;
    ofs.close();

    Student s1;
    ifstream ifs(filePath);
    ifs >> s1;
    cout << "Name : " << s1.stuName << endl;
    cout << "Roll : " << s1.stuRollNo << endl;
    cout << "Branch : " << s1.branchName << endl;
    ifs.close();


    return 0;
}



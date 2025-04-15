#include <iostream>
#include <fstream>
#include <cstring>
using namespace std;

class Student {
private:
    char name[100];
    int marks[5];

public:
    void getData() {
        cout << "Enter Name : ";
        cin.getline(name, 100);
        cout << "Enter Marks for 5 Sub : \n";
        for (int i=0; i<5; i++) {
            cin >> marks[i];
        }
    }

    void showData() {
        cout << "Student's Name : " << name << endl;
        cout << "Marks : \n";
        for (int i=0; i<5; i++) {
            cout << marks[i] << ' ';
        }
        cout << endl;
    }

    char* getName() { return (name); }
};

Student stuObj;


// Writing File
void writeData()
{
    ofstream ofs;
    ofs.open("data/Student.dat", ios::out|ios::binary|ios::app);
    if(!ofs.is_open()) {
        cout << "Error in Opening File...\n";
        exit(0);
    }
    int noOfStudents;
    cout << "How many Student's Details you want to add? ";
    cin >> noOfStudents;
    for (int i=0; i<noOfStudents; i++) {
        cin.get();  // extract the enter button
        stuObj.getData();
        ofs.write((char*)&stuObj, sizeof(stuObj));
    }
    ofs.close();
}

// Reading File Contents
void readData()
{
    ifstream ifs;
    ifs.open("data/Student.dat", ios::in|ios::binary);
    if(!ifs.is_open()) {
        cout << "Error in Opening File...\n";
        exit(0);
    }

    ifs.read((char*)&stuObj, sizeof(stuObj));
    while(!ifs.eof())
    {
        stuObj.showData();
        ifs.read((char*)&stuObj, sizeof(stuObj));
    }
    ifs.close();
}


void deleteData()
{
        ifstream ifs("data/Student.dat", ios::in|ios::binary);
        ofstream ofs;
        ofs.open("data/temp.dat", ios::out|ios::binary);

        char name[100];
        cout << "Enter the Name of the Student to be deleted : ";
        cin >> name;

        ifs.read((char*)&stuObj, sizeof(stuObj));
        while (!ifs.eof()) {
            if (strcmp(name, stuObj.getName()) != 0) {
                ofs.write((char*)&stuObj, sizeof(stuObj));
            }
            ifs.read((char*)&stuObj, sizeof(stuObj));
        }

        ifs.close();
        ofs.close();

        remove("data/Student.dat");
        rename("data/temp.dat", "data/Student.dat" );
}


int main()
{
    writeData();
    readData();

    deleteData();
    readData();

    return 0;
}

#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int a(10);      // constructor init
    int b{11};      //
    int c = (12);
    int d = {24};
    int e = 14;     // c init

    int x = 01010;  // octal format
    int y = 0X101;  // hex format

    char ch = 'A';  // character init
    char ch2 = 65;  // char init
    char ch3 = 65.034;  // char init, the decimal part will get truncate. (i.e., 0.34 omitted)
    char ch4 = 0x50;    // hex rep of char

    float f1 = 455.78f; // compiler assume it as float; the good practice to add 'f' at the end. (and this 'f' is NOT case sensitive.
    float f2 = 566e2F;  // scientific notation.
    float f3 = 566e-2;  // negative

    long long salary = 123456890;   // long is used to extend size

    string name = "John";   // NOTE: string is not a data type in C++, its a class.

    // sizeof(<type>) used to find size.
    cout << "Size of integer: "<<sizeof(int)<< endl;
    cout << "Size of char: "<<sizeof(char)<<endl;
    cout << "Size of bool: "<<sizeof(bool)<<endl;

    // INT_MIN and INT_MAX is used to find range of integer. same follows for char, long etc.
    cout << "Range of int: " << INT_MAX << endl;
    cout << "Range of int: " << UINT_MAX << endl;
    cout << "Range of int: " << INT_MIN << endl;

    cout << "Range of float: " << FLT;

    return 0;

}

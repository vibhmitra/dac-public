#include<iostream>

using namespace std;

int main()
{

    int a = 10, b = 13;

    cout<<"Bitwise AND: "<< (a & b) << endl;
    cout<<"Bitwise OR: "<< (a | b) << endl;
    cout<<"Bitwise XOR: "<< (a ^ b) << endl;
    cout<<"Bitwise NOT a:"<< (~a) << endl;
    cout<<"Bitwise NOT b: "<< (~b) << endl;

    cout << "\n\n ---- BITWSE SHIFT ---- \n";
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
    a = a << 2; // bitwise left
    cout<<"Bitwise left shift of a: "<<a<<endl;

    b = b >> 2; // bitwise right; shifts binary data 2 bits right.
    cout<<"Bitwise right shift of b: "<<b<<endl;
    return 0;

}

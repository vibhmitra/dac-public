#include <iostream>
#include <string>

using namespace std;

int main()
{
    string msg = "Hello, C++";

    cout << msg << endl ;
    cout << "Length : " << msg.length() << endl;
    cout << "Size : " << msg.size() << endl;

    cout << "Capacity : " << msg.capacity() << endl;

    //  resize
    msg.resize(40);
    cout << "Resized String Capacity:" << msg.capacity() << endl;

    // indexing
    cout << "At(2) : " << msg.at(1) << endl;
    cout << "msg[2] : " << msg[1] << endl;

    cout << "msg.empty() : " << msg.empty() << endl;    // ) means string not empty.

    cout << "msg.substr(2, 6) : " << msg.substr(2, 6) << endl;  // substr(<starting index>, <end index>);

    cout << "msg.replace(start, end, string) : " << msg.replace(7, 9, "Java") << endl;
    cout << msg.append("& C++") << endl;    // Add contents to the end of the string

    cout << msg.insert(7, "CDAC, ") << endl; // add contents in the middle

    string msg1;
    msg1 = msg ;    // Copying String

    cout <<" msg1 : " << msg1 << endl;

    string str = "Hello" ;
    if (!str.empty())
    {
        cout << "String is not empty. " << endl ;
    }

    msg.clear();    // Clear String

}


}

/* NESTED While Loop - */

#include <iostream>

using namespace std;

int main()
{
    int n, i = 1, input;
    cout << "Enter the num: ";
    cin >> n;

    while (i <= n)
    {
        input = 1;
        while (input <= i)
        {
            cout << input << " ";
            input += 1;
        }
        i++;
        cout << endl;
    }
    return 0;
}

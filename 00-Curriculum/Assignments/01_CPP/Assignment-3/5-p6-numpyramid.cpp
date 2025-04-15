/* Problem 5-f */

#include <iostream>

using namespace std;

int main()
{
    int patternHeight = 5;

    for (int i = 1; i <= patternHeight; i++)
    {
        for (int j = patternHeight; j > i; j--)
        {
            cout << " ";
        }

        for (int k = 1; k <= i; k++)
        {
            cout << i <<" ";
        }
        cout << endl;
    }

     return 0;
}

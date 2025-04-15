/* Problem 5-b */

#include <iostream>

using namespace std;

int main()
{
    int patternHeight = 5;

    for (int v = 1; v <= patternHeight; v++)
    {
        for (int h = 1; h <= v; h++)
        {
            cout << h ;
        }
        cout << endl;
    }

     return 0;
}

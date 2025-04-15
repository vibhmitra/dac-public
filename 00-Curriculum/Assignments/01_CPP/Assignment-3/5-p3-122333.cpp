/* Problem 5-c */

#include <iostream>

using namespace std;

int main()
{
    int patternHeight = 5;

    for (int v = 1; v <= patternHeight; v++)
    {
        for (int h = 1; h <= v; h++)
        {
            cout << v ;
        }
        cout << endl;
    }

     return 0;
}

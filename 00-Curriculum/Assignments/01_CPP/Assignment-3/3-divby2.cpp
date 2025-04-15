/* Problem 3    */
#include <iostream>

using namespace std;

int main()
{
    int sumNum = 0; // init

    // logic
    cout << "The Numbers b/w (1-50) that are also divisible by 2 are: " << endl;
    for (int iTemp = 1; iTemp <= 50; iTemp++)
    {
        // divisibility check
        if (iTemp % 2 == 0)
        {
            cout << iTemp << " ";   // printing numbers
            sumNum += iTemp;
        }
    }
    cout << endl <<"Their SUM is : " << sumNum << endl; // printing the sum

    return 0;
}

/* While Loop - Example 2 */

#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int inputNumber;
    int count = 0;
    int sum = 0;
    int max = 0;
    int min = INT_MAX;
    int exit = -1;  // to terminate

    cout << "Enter the positive value (press " << exit <<" to Exit) : ";


    while (cin  >> inputNumber && inputNumber != exit)
    {
        // Check the value is positive or not.
        if (inputNumber >= 0)
        {
            count++;
            sum += inputNumber;
            if (max < inputNumber) max = inputNumber;
            if(min > inputNumber)  min = inputNumber;
        }
        else
        {
            cout << "Enter Positive Value!\n";
        }
    }

    if (count > 0)
    {
            cout << "Tot Positive: "<< count << endl;
            cout << "Sum: " << sum << endl;
            cout << "Max: " << max << endl;
            cout << "Min: " << min << endl;
           // cout << fixed << setprecision(2);   // fixed manupulator
            cout << fixed << setprecision(2) <<"Avg: " << double(sum/count) << endl;
    }
    return 0;
}

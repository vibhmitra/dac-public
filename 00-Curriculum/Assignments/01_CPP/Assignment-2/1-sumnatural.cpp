/* Problem 1 */
#include <iostream>

using namespace std;

int main()
{
    int num, sum;

    cout << "Enter a number: ";
    cin >> num;
    sum = (num)*(num + 1)/(2);
    cout << "Sum : " << sum;
    return 0;
}

#include <iostream>
using namespace std;

int maxArray(int *, int);     // Prototyping
int minArray(int *, int);

int main()
{
    int A[5] = {10, 60, 30, 9, 50};

    cout << "MAX: " << maxArray(A, 5) << endl;  // Calling Function by passing Address of First Element of Array.
    cout << "MIN: " << minArray(A, 5) << endl;

    return 0;
}

int maxArray(int *arr, int size)
{
    int maxValue = *arr;
    for (int i = 1; i < size; i++)
    {
        if (maxValue < *(arr + i))
        {
            maxValue = *(arr + i);
        }
    }
    return (maxValue);
}

int minArray(int *arr, int size)
{
    int minValue = *arr;
    for (int i = 1; i < size; i++)
    {
        if (minValue > *(arr + i))
        {
            minValue = *(arr + i);
        }
    }
    return (minValue);
}

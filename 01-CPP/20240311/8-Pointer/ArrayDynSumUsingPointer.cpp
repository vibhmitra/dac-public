#include <iostream>
using namespace std;

int maxArray(int *, int);     // Prototyping
int minArray(int *, int);
int sumArray(int *, int *);

int main()
{
    int A[5] = {10, 20, 30, 40, 50};
    cout << &A[1] << " " << &A[2] << " " << &A[3] << endl;  // checking memory

    cout << "MAX: " << maxArray(A, 5) << endl;  // Calling Function by passing Address of First Element of Array.
    cout << "MIN: " << minArray(A, 5) << endl;

    cout << "SUM: " << sumArray(&A[1], &A[3]) << endl;  // Sum from index 1 to index 3
    cout << "SUM: " << sumArray(&A[0], &A[2]) << endl;  // Sum from index 0 to index 2

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

int sumArray(int *pStart, int *pEnd)
{
    int sum = 0;
    for (int *p = pStart; p <= pEnd; p++)
    {
        sum += *(p);
    }
    return (sum);
}

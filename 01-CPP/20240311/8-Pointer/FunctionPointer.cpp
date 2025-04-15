#include <iostream>

using namespace std;

int Add(int a, int b){ return a+b; }
int Sub(int a, int b){ return a-b; }
int Max(int a, int b){ return (a>b?a:b);}

int main()
{
    // Declaration of Function Pointer
    int (*fpAdd) (int, int);
    int (*fpSub) (int, int);
    int (*fpMax) (int, int);

    // Assign address of function to the function pointer
    fpAdd = &Add;
    fpSub = &Sub;
    fpMax = &Max;

    // Calling the fn pointer
    int resultAdd = fpAdd(2,2);
    int resultSub = fpSub(2,2);
    int resultMax = fpMax(9,7);

    cout<<"RA: " <<resultAdd<<endl;
    cout<<"RS: " << resultSub<<endl;
    cout<<"RM: " << resultMax<<endl;

    return 0;
}

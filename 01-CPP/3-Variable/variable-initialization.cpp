#include <iostream>

using namespace std;

int main()
{

    int num1 = 100; // C-Like Initialization
    int num2 (200); // Constructor Initialization
    int num3 {300}; // Uniform Initialization
    int sum = num1 + num2 + num3;
    cout<<"Total Sum : " << sum << endl;
    return 0;
}

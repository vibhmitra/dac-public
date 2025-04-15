#include <iostream>

using namespace std;


template <class T>
T maximum(T numOne, T numTwo) { return (numOne > numTwo ? numOne : numTwo); }   // template body ; here 'T' is just naming convention;

template <class T>
T minimum(T numOne, T numTwo) { return (numOne < numTwo ? numOne : numTwo); }


int main()
{
    cout << maximum(10, 50) << endl;        // for int
    cout << maximum(10.5f, 20.3f) << endl;  // for float
    cout << maximum(1022.5d, 98476.3d) << endl;  // for double
    cout << maximum('A', 'C') << endl;  // for char

    cout << endl;

    cout << minimum(10, 50) << endl;        // for int
    cout << minimum(10.5f, 20.3f) << endl;  // for float
    cout << minimum(1022.5d, 98476.3d) << endl;  // for double
    cout << minimum('A', 'C') << endl;  // for char


    return 0;
}

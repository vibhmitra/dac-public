/* Problem 2: */
#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    float a, b, c, root1, root2;

    cout << "Enter Value for a, b, c : ";
    cin >> a >> b >> c;
    root1 = (-b + sqrt((b*b) - (4*a*c)))/(2*a);
    root2 = (-b - sqrt((b*b) - (4*a*c)))/(2*a);

    cout << "Roots are : " << endl << root1 << endl << root2 << endl;
    return 0;
}

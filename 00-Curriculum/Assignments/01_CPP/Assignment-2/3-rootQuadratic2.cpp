/* Problem 3: */
#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    float a, b, c, discriminant, root1, root2;

    cout << "Enter Value for a, b, c : ";
    cin >> a >> b >> c;

    discriminant = (b * b) - (4 * a * c);

    if (discriminant > 0)
    {
        root1 = (-b + sqrt(discriminant))/(2*a);
        root2 = (-b - sqrt(discriminant))/(2*a);
        cout << "Two Roots Exist, Roots are : " << endl;
        cout << "Root 1: " << root1 << endl ;
        cout << "Root 2: " << root2 << endl;
    }
    else
    if (discriminant == 0)
    {
        cout << "Roots Exist and are Same. " << endl;
    }
    else
    {
        cout << "Cannot Find The Roots." << endl;
    }
    return 0;
}

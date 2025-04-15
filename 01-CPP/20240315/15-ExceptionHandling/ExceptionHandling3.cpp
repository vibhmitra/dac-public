#include <iostream>
#include <stdexcept>

using namespace std;

int AddPositiveInt(int a, int b)
{
    if (a < 0 || b < 0)
    {
        throw (std::invalid_argument("Number Must Be Positive."));
    }

    return (a+b);
}

int main()
{
    int a, b ;
    try
    {
        cin >> a >> b ;
        cout << "Sum : " << AddPositiveInt(a, b);
    }

    catch (std::invalid_argument ERR)
    {
        cerr << ERR.what() << endl;
    }

    catch (...)
    {
        cout << "Unexpected." << endl;
    }

}

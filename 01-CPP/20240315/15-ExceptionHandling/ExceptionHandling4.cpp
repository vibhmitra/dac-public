#include <iostream>
#include <stdexcept>

using namespace std;

int ageValidator(int age)
{
    if (age < 0)
    {
        throw (std::invalid_argument("Age Must Be Positive.\n"));
    }
    if ((age > 30 || age < 18))
    {
        throw (std::out_of_range("Age Must Be b/w 18 to 30.\n"));
    }
    else
    {
        return (age);
    }
}

int main()
{
    int a;

    cout << "Enter age b/w 18 to 30 > ";
    cin >> a;
    try
    {
        cout << ageValidator(a) << endl;
    }

    catch (std::invalid_argument neg)
    {
        cerr << neg.what() << endl;
    }

    catch (std::out_of_range range)
    {
        cerr << range.what() << endl;
    }

    catch (...)
    {
        cout << "Unexpected Error!" << endl;
    }

}

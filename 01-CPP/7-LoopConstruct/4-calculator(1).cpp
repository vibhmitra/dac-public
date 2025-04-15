#include<iostream>
#include<cmath>

using namespace std;

int main()
{

    char ch;
    int menuItem;
    int a, b;

    do
    {
        cout << "Select Option: \n";
        cout << "1. Addition\n"
             << "2. Subtraction\n"
             << "3. Multiplication\n"
             << "4. Division\n";
        cin >> menuItem;

        switch (menuItem)
        {
            case 1:
                cout << "Enter Numbers: ";
                cin >> a ;
                cout << "SUM : "
                break;

            case 2:
                cout << "Enter Numbers: ";
                cin >> a >> b;
                cout << "DIFF : " << a - b;
                break;

            case 3:
                cout << "Enter Numbers: ";
                cin >> a >> b;
                cout << "PROD : " << a * b;
                break;

             case 4:
                cout << "Enter Numbers: ";
                cin >> a >> b;
                if (b == 0) cout << "DIV ERR : ";
                else cout << "DIV : " << a / b;
                break;

            default:
                cout << "Wrong Choice!\n";
        }
        cout << "\nDo you want to continue (Y/N)?: ";
        cin >> ch;

    } while(ch == 'Y' || ch == 'y');
}

#include <iostream>
using namespace std;


//                                          here factor will by default getting 1.09;
float moneyRecieved(int currentMoney, float factor = 1.09)
{
    return currentMoney * factor;
}

int main()
{
    cout << moneyRecieved(4000) << endl;
    cout << moneyRecieved(4000, 2) << endl;
    return 0;
}

#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
    vector<int> vec; // int type vector | STL containers;

    int n1 = 90, n2 = 34;
    cout << "MAX : " << max(n1, n2) << endl;
    cout << "MIN : " << min(n1, n2) << endl;


    // push_back
    vec.push_back(45);
    vec.push_back(345);
    vec.push_back(67);
    vec.push_back(23);
    vec.push_back(89);

    for(int i : vec) {
        cout << i << endl;
    }

    cout << "'89' IN VEC? : " << binary_search(vec.begin(), vec.end(), 89) << endl; // binary_search will return 1 if T, 0 if F
    cout << "'60' IN VEC? : " << binary_search(vec.begin(), vec.end(), 60) << endl;
}

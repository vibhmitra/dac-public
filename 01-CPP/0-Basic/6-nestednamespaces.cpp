#include <iostream>
using namespace std;

namespace outer
{
    int x = 10;

    namespace inner
    {
        int y = 20;
        int z = 30;
    }
}

using namespace outer::inner;

int main()
{
    using outer::inner::z;
   // cout<<outer::inner::y<<endl;
    cout<<z;
    return 0;
}

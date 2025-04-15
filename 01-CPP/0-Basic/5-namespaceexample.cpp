#include <iostream>
using namespace std;

namespace A
{
    int x = 10;
}
namespace B
{
    int y = 20;

    namespace C
    {
        int z = 30;
    }
}

int main()
{
    using A::x;
    cout<<x<<endl;

    cout<<B::y <<endl;

    cout<<B::C::z<<endl;
    return 0;
}

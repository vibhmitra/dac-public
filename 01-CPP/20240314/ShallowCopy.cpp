#include <iostream>

using namespace std;

class CDAC
{
    public:
        int *ptr;
        CDAC()
        {
            ptr = new int[5];
        }

        ~CDAC()
        {
            delete []ptr;
        }
};

int main()
{
    CDAC cd1;
    cd1.ptr[0] = 10;

    CDAC cd2;
    cd2 = cd1;  // SHALLOW COPY // Referring to same memory

    cout << cd1.ptr[0] << endl;
    cd2.ptr[0] = 50;
    cout << cd1.ptr[0] << endl;


    delete []cd2.ptr;

    cout << cd2.ptr[0];

    return 0;
}

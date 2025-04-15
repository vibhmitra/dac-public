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

        CDAC(CDAC &cd)
        {
            ptr = new int[5];
            memcpy(ptr, cd.ptr , sizeof(int)*5 );
        }
};

int main()
{
    CDAC cd1;
    cd1.ptr[0] = 100;

    CDAC cd2 = cd1;
    cd2.ptr[0] = 200;



    cout << cd2.ptr[0] << endl;
    cout << cd1.ptr[0];


    //delete []cd2.ptr;

    return 0;
}

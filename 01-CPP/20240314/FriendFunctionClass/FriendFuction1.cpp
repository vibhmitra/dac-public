#include <iostream>

using namespace std;

class myClass
{
    private:
        int x;
        float n1, n2;
    protected:
        int y;
    public:
        int z;
        friend void FriendFunction();   // Friend
        friend float Average(myClass);  // Passing class object inside Friend fucnction.

        void getValue()
        {
            cin >> n1 >> n2;
        }
};


void FriendFunction()
{
    myClass obj;
    obj.x = 10;     // Private Member is getting Accessed
    obj.y = 30;     // Protected Member is getting Accessed
    obj.z = 40;

    cout << "x : " << obj.x << endl;
    cout << "y : " << obj.y << endl;
    cout << "z : " << obj.z << endl;
}

float Average(myClass obj) { return ((obj.n1 + obj.n2)/2); }


int main()
{
    FriendFunction();
    myClass o;
    o.getValue();
    cout << "AVG: " << Average(o) << endl;
}

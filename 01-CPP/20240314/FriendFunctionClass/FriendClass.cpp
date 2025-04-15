#include <iostream>

using namespace std;

class Area
{
    private:
        int length, breadth, area;

    protected:
        int y;

    public:
        Area(int l, int b) : length(l), breadth(b) { }  // Intiallizing Constructor

        void calculateArea()
        {
            area = length * breadth ;
        }

    friend class friendClass;   // Friend Class

};

class friendClass
{
        public:
            void showArea(Area o)
            {
                cout << "AREA: " << o.area ;
            }
};

int main()
{

    Area objArea(2, 3);
    objArea.calculateArea();

    friendClass objFriend;
    objFriend.showArea(objArea);

}

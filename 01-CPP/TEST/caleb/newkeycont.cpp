#include <iostream>
#include <string>
using namespace std;

class User {
public:
    string name;
};

int main()
{
    int* x = new int(5);

    cout << "The Pointer " << x << " points to " << *x << endl;
    delete []x;
    cout << *x ;    // Memory Freed

    cout << endl;

    User* u = new User();       // Allocating Memory Dynamically
    (*u).name = "Caleb Curry";  // This is same as the below code.
    u->name = "Caleb Curry";    // Short hand by using '->' operator
    cout << u->name << endl;
/* memory Hogger
    while(true) {
        long int *x = new long int(537462378);
        long int *y = new long int(537462378);
        long int *z = new long int(537462378);
        long int *a = new long int(537462378);
        long int *b = new long int(537462378);
        long int *c = new long int(537462378);
        long int *d = new long int(537462378);
        long int *f = new long int(537462378);
        long int *g = new long int(537462378);
        cout << x << y << z <<  endl;
    }
*/
    return 0;
}

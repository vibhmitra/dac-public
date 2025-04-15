
#include <iostream>

int main()
{
    // Concept 1
    {
        bool a = true;
        bool b = false;

        int x = 10;
        int y = 5;
        std::cout << (x | y);
    }
    // 😀
    // The IF will execute or not
    {
        // Try changing condition of if-statement 
        // the only time it will not execute is when you put 0 in it.
        if (9) {
            std::cout << "Its Executed";
        }
    }

    // false 🙆‍🙆‍🙆‍
    {
        std::cout << (false && true) || false || true;
        // break down
        std::cout << false || true; // this will produce false.
        // well here i just remembered that '0' is TRUE here, like WTF! 🤷‍
    }


    // the bool
    {
        bool a = false;
        a++;
        std::cout << a;
        //a--; 👈 This ain't work here bruh
    }

    // Is Signed
    {
        system("CLS");
        char a = 'A';
        std::cout << -a;
    }
}

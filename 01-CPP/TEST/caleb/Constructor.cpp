#include <iostream>

using namespace std;

class Book {
    public:
        string title;
        string author;
        int pages;

        Book() {
            title = "DefaultTitle";
            author = "DfaultAuthor";
            pages = 0;
            string msg = "(Default Constructor Called)\n";
            cout << msg;
        }

        Book (string aTitle, string aAuthor = "DefaultAuthor", int aPages = 0) {
            title = aTitle;
            author = aAuthor;
            pages = aPages;
            string msg = "(Parameter Constructor Called)\n";
            cout << msg ;
        }
};


int main()
{
    Book book1;

    book1.title = "Harry Potter And Smth";
    book1.author = "JK Rolling";
    book1.pages = 500;

    cout << book1.title << '\t' << book1.author << '\t' << book1.pages <<'\n';

    Book book2;

    book2.title = "Lord of The Rings";
    book2.author = "Tolkein";
    book2.pages = 1323;
    cout << book2.title << '\t' << book2.author << '\t' << book2.pages <<'\n';

    Book book3("The Secret Garden");
    cout << book3.title << '\t' << book3.author << '\t' << book3.pages <<'\n';

    Book book4;
    cout << book4.title << '\t' << book4.author << '\t' << book4.pages <<'\n';

    return 0;
}

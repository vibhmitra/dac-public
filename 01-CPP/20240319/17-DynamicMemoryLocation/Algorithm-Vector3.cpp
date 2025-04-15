#include <iostream>
#include <algorithm>
#include <vector>
#include <fstream>
using namespace std;

class Item {
private:
    string name;
    float price;
    int quantity;
public:
    Item() {};
    Item(string, float, int );
    friend ifstream & operator >> (ifstream&, Item&);
    friend ofstream & operator << (ofstream&, Item&);
    friend ostream & operator << (ostream&, Item&);
};

Item::Item(string itemName, float itemPrice, int itemQuantity)
{
    name = itemName;
    price = itemPrice;
    quantity = itemQuantity;
}

// OPERATOR OVERLOADING FOR OFSTREAM PUT TO OPERATOR insertion
ofstream & operator << (ofstream &ofs, Item &i)
{
    ofs << i.name << endl;
    ofs << i.price << endl;
    ofs << i.quantity << endl;
    return ofs;
}

// OPERATOR OVERLOADING FOR IFSTREAM GET OPERATOR extraction
ifstream & operator >> (ifstream &ifs, Item &i)
{
    ifs >> i.name;
    ifs >> i.price;
    ifs >> i.quantity;
    return ifs;
}

// OPERATOR OVERLOADING FOR COUT OBJECT I GUESS :p
ostream & operator << (ostream &os, Item &i)
{
    os << "\tPRODUCT NAME\t: " << i.name << endl;
    os << "\tPRODUCT PRICE\t: " << i.price << endl;
    os << "\tQUANTITY\t: " << i.quantity << endl;
    return os;
}

int main()
{
    int noOfProducts;
    string name;
    float price;
    int quantity;
    vector<Item*> vectorList;

    cout << "Items to Store : ";
    cin >> noOfProducts;

    if (noOfProducts != 0) {
        cout << "Enter Details : \n";
        for (int i = 0; i < noOfProducts; i++) {
            cout << "PRODUCT NAME : ";
            cin >> name;
            cout << "PRODUCT PRICE : ";
            cin >> price;
            cout << "QUANTITY : ";
            cin >> quantity;
            vectorList.push_back(new Item(name, price, quantity));
        }
    }

    // WRITING DATA TO FILE
    ofstream ofs("data/Algorithm-Vector3.txt", ios::out | ios::app); //  this also works -->  ofs.open("productdetails.txt", ios::out);
    vector<Item*>::iterator itr;
        //    ofs << noOfProducts << endl;     // Putting the No of Product Inside same file.
    for (itr = vectorList.begin(); itr != vectorList.end(); itr++) {
        ofs << **itr;
    }


    // READING DATA FROM FILE
    Item item;
    ifstream ifs("data/Algorithm-Vector3.txt", ios::in);
    for (int i = 0; i < 4; i++) {           // make noOfProducts dynamic pleassssseeeeeee!!!!!!
        ifs >> item;
        cout << "Product Details " << i+1 << " > " << endl;
        cout << item << endl;
    }
    return 0;
}

#include <iostream>

using namespace std;

void guessingGameTry(void);
void guessingGameWhileLoop(void);
void whileLoop(void);
void BetterCalc(void);
string getDayOfWeek(int);

int main(int argc, char** argv)
{
//    BetterCalc();
//    cout << "Day Name : " << getDayOfWeek(4);
//    whileLoop();
//    guessingGameWhileLoop();
//    guessingGameTry();
    return 0;
}

void guessingGameTry(void) {
    int secretNum = 7;
    int guess, guessCount = 0, guessLimit = 3;
    bool outOfGuesses = false;

    cout << "Using While Loop\n";
    while (secretNum != guess && !outOfGuesses) {
        if (guessCount < guessLimit) {
            cout << "Enter Guess: ";
            cin >> guess;
            guessCount++;
        }
        else
            outOfGuesses = true;
    }

    if (!outOfGuesses)
        cout << "You Win!\n";
    else
        cout << "You Loose!\n";
}


void guessingGameWhileLoop(void) {
    int secretNum = 7;
    int guess;
    cout << "Using While Loop\n";
    while (secretNum != guess) {
            cout << "Enter Guess: ";
            cin >> guess;
    }

    cout << "You Win!\n";
}

void whileLoop(void)
{
    int index = 1;
    while (index <= 5) {
        cout << index << '\n';
        index++;
    }
}

void BetterCalc(void)
{
    int num1, num2, result = 0;
    char op;

    cout << "Enter First Num : ";
    cin >> num1;
    cout << "Enter Operator : ";
    cin >> op;
    cout << "Enter Second Num : ";
    cin >>num2;

    if (op == '+') {
        result = num1 + num2;
    }
    else if (op == '-') {
        result = num1 - num2;
    }
    else if (op == '*') {
        result = num1 * num2;
    }
    else if (op == '/') {
        result = num1 / num2;
    }
    else
        cout << "Invalid operator." << endl;

    cout << "Result : " << result << endl;
}

string getDayOfWeek (int dayNum)
{
    string dayName;

    switch (dayNum) {
    case 1:
        dayName = "Sunday";
        break;
    case 2:
        dayName = "Monday";
        break;
    case 3:
        dayName = "Tuesday";
        break;
    case 4:
        dayName = "Wednesday";
        break;
    case 5:
        dayName = "Thursday";
        break;
    case 6:
        dayName = "Friday";
        break;
    case 7:
        dayName = "Saturday";
        break;
    default:
        cout << "Invalid Input.\n";
    }

    return (dayName);
}

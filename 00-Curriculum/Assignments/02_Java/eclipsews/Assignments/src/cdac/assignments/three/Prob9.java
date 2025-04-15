/* Problem 9.	Create a class called Account, which models a bank account.
                Create the following variables, methods, Overloaded Constructor and public getter and setter method in the Account.java file.
                a.	Two private instance variables: accountNumber (int), and balance (double) which maintains the current account balance.
                b.	Constructors (overloaded).
                c.	Getters and Setters for the private instance variables. There is no setter for accountNumber as it is not designed to be changed.
                d.	public methods credit() and debit(), which adds/subtracts the given amount to/from the balance, respectively.
                e.	A toString(), which returns "A/C no:xxx, Balance=$xxx.xx", with balance rounded to two decimal places.
                f.	Create another the AccountTest class to test all the public methods you have created in the Account Class.
                g.	Note: only AccountTest class will contain the java main() method i.e., public static void main(String[ ] args)
*/

package cdac.assignments.three;

class Account {
    // instance vars
    private int accountNumber;
    private double balance;
    public Account (int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Getter Setter fot Instances
    public double getBalance() { return balance; }
    public int getAccountNumber() { return accountNumber; }
    public void setBalance(double balance) { this.balance = balance; }

    // public methods()
    public void Credit(int newBalance) {
        this.balance += newBalance;
    }

    public void Debit(int newBalance) {
        this.balance -= newBalance;
    }

    // toString Override
    @Override
    public String toString() {
        return "Account {" +
                "Account Number > " + accountNumber +
                ", Account Balance > $" + balance +
                '}';
    }
}


// MainClass
 class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1001, 23670); // creating class instances + the initialization via constructors

        System.out.println(account.toString());
        System.out.println("Account Number : " + account.getAccountNumber());

        System.out.println("Testing Debit : $ +5000");
        account.Credit(5000);
        System.out.println("Updated Balance : $" + account.getBalance());

        System.out.println("Testing Debit : $ -2300");
        account.Debit(2300);
        System.out.println("Updated Balance : $" + account.getBalance());

        System.out.println("Testing setBalance(newBalance) : $ 10");
        account.setBalance(10);
        System.out.println("Updated Balance : $" + account.getBalance());
    }
}

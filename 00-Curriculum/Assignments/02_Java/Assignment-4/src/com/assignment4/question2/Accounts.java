package com.assignment4.question2;

public class Accounts {
	private String id;
	private String name;
	private int balance = 0;
	

	public Accounts() {
		this.id = "0";
		this.name = "Default";
	}
	
	public Accounts(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Accounts(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// Getter Setter
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	// Methods
	int credit(int amount) { 
		balance += amount;
		return (balance); 
	}
	
	int debit(int amount) { 
		if (amount <= balance) {
			balance -= amount;
			return (balance);
		}
		else {
			System.out.println("Amount Exceeded Balance");
			return (balance);
		}
	}
	
	int transferTo(Accounts another, int amount) {
		if (amount <= balance) {
			this.debit(amount);
			another.credit(amount);
			return (balance);
		}
		else {
			System.out.println("Amount Exceeded Balance");
			return (balance);
		}
	}
	
	
	@Override
	public String toString() {
		return "Accounts [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		Accounts account1 = new Accounts("A101", "John", 88);
		System.out.println(account1);
		Accounts account2 = new Accounts("A102", "Kumar", 0);
		System.out.println(account2);
		
		System.out.println("ID : " + account1.getId());
		System.out.println("Name : " + account1.getName());
		System.out.println("Balance : " + account1.getBalance());
		
		account1.credit(100);
		System.out.println(account1);
		account1.debit(50);
		System.out.println(account1);
		account1.debit(500);
		System.out.println(account1);
		
		account1.transferTo(account2, 100);
		System.out.println(account1);
		System.out.println(account2);
		
	}

}

package com.assignment4.question4;

class Customer {
	private int customerId;
	private String customerName;
	private int customerDiscount;
	
	public Customer() {};
	
	public Customer(int customerId, String customerName, int customerDiscount) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerDiscount = customerDiscount;
	}
	
	// getters
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public int getCustomerDiscount() {
		return customerDiscount;
	}
	
	public void setCustomerDiscount(int customerDiscount) {
		this.customerDiscount = customerDiscount;
	}
	
	@Override
	public String toString() {
		return (this.getCustomerName() + "(" + this.getCustomerId() + ")(" + this.getCustomerDiscount() + "%)");
	}
}

class Invoice extends Customer{
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice() {};
	public Invoice(int id, Customer customer, double amount) {
		super();
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	
	// getters-setters
	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	double getAmountAfterDiscount() {
		setAmount(this.getAmount() - (this.getAmount() * this.customer.getCustomerDiscount() / 100));
		return (this.getAmount());
	}

	@Override
	public String toString() {
		return ("Invoice [id=" + this.id + ", customer=" + this.customer + ", amount=" + this.amount);
	}
	
	
}


public class Question4 {

	public static void main(String[] args) {
		
		Customer customer = new Customer(88, "John", 10);
		System.out.println(customer);
		
		customer.setCustomerDiscount(8);
		System.out.println(customer);
		
		System.out.println("id is: " + customer.getCustomerId());
		System.out.println("name is: " + customer.getCustomerName());
		System.out.println("discount is: " + customer.getCustomerDiscount());
		
		Invoice invoice = new Invoice(101, customer, 888.8);
		System.out.println(invoice);
		invoice.setAmount(999.9);
		System.out.println(invoice);
		
		System.out.println("Invoice ID is: " + invoice.getId());
		System.out.println("Customer is: " + invoice.getCustomer());
		System.out.println("Amount is: " + invoice.getAmount());
		System.out.println("Customer's Name is: " + customer.getCustomerName());
		System.out.println("Customer's ID is: " + customer.getCustomerId());
		System.out.println("Customer's Discount is: " + customer.getCustomerDiscount());
		
		System.out.println("Amount after discount is: " + invoice.getAmountAfterDiscount());
		
	}

}

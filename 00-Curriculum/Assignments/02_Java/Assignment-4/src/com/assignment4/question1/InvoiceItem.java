package com.assignment4.question1;

public class InvoiceItem {
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public InvoiceItem() {
		this.id = "0";
		this.desc = "Default";
		this.qty = 0;
		this.unitPrice = 0.0;
	}
	
	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		super();
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}


	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}
	
	// Methods
	double getTotal() { return (unitPrice * qty); }
	
	@Override
	public String toString() {
		return "InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}

	public static void main(String[] args) {
		InvoiceItem invoiceitem1 = new InvoiceItem("A01", "Pen Red", 888, 0.08);
		System.out.println(invoiceitem1);
		invoiceitem1.setQty(999);
		invoiceitem1.setUnitPrice(0.99);
		System.out.println(invoiceitem1);
		System.out.println("id is : " + invoiceitem1.getId());
		System.out.println("desc is : " + invoiceitem1.getDesc());
		System.out.println("qty is : " + invoiceitem1.getQty());
		System.out.println("unitPrice is : " + invoiceitem1.getUnitPrice());
		System.out.println("Total is : " + invoiceitem1.getTotal());
		
	}

}

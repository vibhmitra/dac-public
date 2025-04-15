package in.cdac;

public class Customer {

	Integer custId;				// in-built wrapper class Integer
	
	public void setId(String custId) {
		// the integer paraseInt method converts String to Integer
		this.custId = Integer.parseInt(custId);
	}
	
	public String getId() {
		return String.valueOf(custId);	// the valueOf() Integer to String
	}
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId("101");				// VALIDATION
		System.out.println("Customer ID : " + customer.getId());
	}
}

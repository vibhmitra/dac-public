package com.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 
@Component
public class Order {
	
	@NotEmpty(message = "{error.customerName.blank}") 
	private String customerName;
	@NotEmpty(message = "{error.contactNumber.blank}")
	private String contactNumber;
	private String productName;
	@Min(value=1,message="{error.quantity.negative}")
	private int quantity;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

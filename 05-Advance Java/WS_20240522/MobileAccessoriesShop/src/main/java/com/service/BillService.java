package com.service;

import org.springframework.stereotype.Service;

import com.model.Order;

//use appropriate annotation to configure BillService as a Service
@Service
public class BillService {
	
	//calculate the totalCost and return the cost
	public double calculateTotalCost(Order order) {
		double cost=0.0,temp;
		// fill the code
		if(order.getProductName().equalsIgnoreCase("MemoryCard"))
		{
			temp = order.getQuantity() * 300.0;
			cost = temp + (temp * 3.0)/100.0;
		}
		else if(order.getProductName().equalsIgnoreCase("USBCable"))
		{
			temp = order.getQuantity() * 800.0;
			cost = temp + (temp * 3.0)/100.0;
		}
		else if(order.getProductName().equalsIgnoreCase("PenDrive"))
		{
			temp = order.getQuantity() * 650.0;
			cost = temp + (temp * 3.0)/100.0;
		}
		else if(order.getProductName().equalsIgnoreCase("HeadPhone"))
		{
			temp = order.getQuantity() * 450.0;
			cost = temp + (temp * 3.0)/100.0;
		}
		else 
		{
			temp = order.getQuantity() * 1000.0;
			cost = temp + (temp * 3.0)/100.0;
		}
		return cost;

		
		
	}

}

package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Order;
import com.service.BillService;

@Controller
public class BillController {

	@Autowired
	private BillService billService;

	@RequestMapping(value = "/showPage", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("order") Order order) {

		return "showpage";
	}

	@ModelAttribute("productList")
	public Map<String, String> populateProductType() {

		Map<String, String> serviceMap = new HashMap<String, String>();
		serviceMap.put("MemoryCard", "MemoryCard");
		serviceMap.put("USBCable", "USBCable");
		serviceMap.put("PenDrive", "PenDrive");
		serviceMap.put("HeadPhone", "HeadPhone");
		serviceMap.put("TravelAdapter", "TravelAdapter");
		return serviceMap;

	}

	@RequestMapping(value = "/billDesk", method = RequestMethod.POST)
	public String calculateTotalCost(@Valid @ModelAttribute("order") Order order, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "showpage";
		} else {
			double cost = billService.calculateTotalCost(order);
			String name = order.getCustomerName();
			
			model.addAttribute("name", name);
			model.addAttribute("cost", cost);
			model.addAttribute("productName", order.getProductName());
			model.addAttribute("quantity", order.getQuantity());
			
			return "billdesk";
		}
	}

}

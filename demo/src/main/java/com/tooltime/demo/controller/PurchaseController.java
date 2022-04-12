package com.tooltime.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tooltime.demo.model.Customer;
import com.tooltime.demo.service.PurchaseService;

@RestController
public class PurchaseController {
	
	@Autowired
	public PurchaseService purchaseService;
	
	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable("id") Integer customerId) {
		return purchaseService.getByCustomerId(customerId);
		
	}
	
	@PostMapping("/customers")
	public Integer saveCustomerInfo(@RequestBody Customer customer) {
		purchaseService.saveOrUpdateCustomer(customer);
		return customer.getId();
	}
	

}

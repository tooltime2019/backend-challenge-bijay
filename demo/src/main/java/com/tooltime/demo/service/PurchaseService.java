package com.tooltime.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tooltime.demo.model.Customer;
import com.tooltime.demo.repository.CustomerRepository;

@Service
public class PurchaseService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer getByCustomerId(Integer id) {
		return customerRepository.findById(id).get();
	}
	
	public void saveOrUpdateCustomer(Customer customer) {
		customerRepository.save(customer);
	}

}

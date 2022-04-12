package com.tooltime.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tooltime.demo.model.Customer;

@Repository 
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}

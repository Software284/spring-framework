package com.lamichhane.spring.rest.service;

import java.util.List;

import com.lamichhane.spring.rest.entity.Customer;



public interface CustomerService {
	public List<Customer> getCustomers();
   
	public Customer saveCustomer(Customer theCustomer);

	public Customer getCustomers(int theId);

	public void deletCustomer(int id);
}

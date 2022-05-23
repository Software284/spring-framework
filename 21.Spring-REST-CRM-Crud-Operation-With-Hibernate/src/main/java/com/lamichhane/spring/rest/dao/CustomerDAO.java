package com.lamichhane.spring.rest.dao;

import java.util.List;

import com.lamichhane.spring.rest.entity.Customer;



public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public Customer saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int id);
	
}

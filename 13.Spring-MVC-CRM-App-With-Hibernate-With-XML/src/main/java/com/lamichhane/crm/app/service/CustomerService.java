package com.lamichhane.crm.app.service;

import java.util.List;

import com.lamichhane.crm.app.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
   
	public void saveCustomer(Customer theCustomer);

	public Customer getCustomers(int theId);

	public void deletCustomer(int id);
}

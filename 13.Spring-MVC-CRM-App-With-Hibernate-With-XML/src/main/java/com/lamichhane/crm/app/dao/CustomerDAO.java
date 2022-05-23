package com.lamichhane.crm.app.dao;

import java.util.List;

import com.lamichhane.crm.app.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int id);
	
}

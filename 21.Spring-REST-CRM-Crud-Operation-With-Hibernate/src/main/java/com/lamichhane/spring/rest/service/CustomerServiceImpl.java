package com.lamichhane.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.spring.rest.dao.CustomerDAO;
import com.lamichhane.spring.rest.entity.Customer;



@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDao;
	
	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED)
	public List<Customer> getCustomers() {
		
		return customerDao.getCustomers();
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED)
	public Customer saveCustomer(Customer theCustomer) {
		Customer cust = customerDao.saveCustomer(theCustomer);
		return cust;
		
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED)
	public Customer getCustomers(int theId) {
		
		return customerDao.getCustomer(theId);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED)
	public void deletCustomer(int id) {
		
		customerDao.deleteCustomer(id);
		
	}

}

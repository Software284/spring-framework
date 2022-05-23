package com.lamichhane.crm.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.crm.app.dao.CustomerDAO;
import com.lamichhane.crm.app.entity.Customer;

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
	public void saveCustomer(Customer theCustomer) {
		customerDao.saveCustomer(theCustomer);
		
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

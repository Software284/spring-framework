package com.lamichhane.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lamichhane.spring.rest.entity.Customer;
import com.lamichhane.spring.rest.exception.classes.CustomerNotFoundException;
import com.lamichhane.spring.rest.service.CustomerService;



@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	
//	@RequestMapping(value="/list",method = RequestMethod.GET)
	@GetMapping("/customers")
	public List<Customer> listCustomers() {
		List<Customer> customers = customerService.getCustomers();
		return customers;
	}
	
	@GetMapping("/customers/{customerId}")
	public Customer showFormForUpdate(@PathVariable("customerId") int theId) {
		Customer theCustomer = customerService.getCustomers(theId);
		return theCustomer;
	}
	
	
	@PostMapping("/customers")
	public Customer saveCustomer(@RequestBody Customer theCustomer) {
		theCustomer.setId(0);
		Customer cust = customerService.saveCustomer(theCustomer);
		return cust;
		
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer theCustomer) {
		Customer cust = customerService.saveCustomer(theCustomer);
		return cust;
		
	}
	

	
	
	@DeleteMapping("/customers/{customerId}")
	public String deleteCustomer(@PathVariable("customerId") int id) {
		Customer cust = customerService.getCustomers(id);
		if(cust == null) {
			throw new CustomerNotFoundException("Customer Not Found - "+id);
		}
		customerService.deletCustomer(id);
		return "Customer Delete With Id - "+id;
	}
}

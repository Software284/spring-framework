package com.lamichhane.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lamichhane.spring.rest.entity.Customer;
import com.lamichhane.spring.rest.service.CustomerService;

@RestController
@RequestMapping("/test")
public class DemoController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer")
	public Customer sayHello() {
		return customerService.getCustomers(0);
	}
}

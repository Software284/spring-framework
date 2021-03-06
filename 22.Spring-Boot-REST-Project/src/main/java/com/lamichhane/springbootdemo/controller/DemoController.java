package com.lamichhane.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapi")
public class DemoController {

	@GetMapping("/")
	public String getHomePage() {
		return "Hello World";
	}
	
	@GetMapping("/name")
	public String getName() {
		return "Mahesh Lamichhane";
	}
}

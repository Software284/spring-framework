package com.lamichhane.controller;

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

import com.lamichhane.entity.Employee;
import com.lamichhane.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		List<Employee> myEmployee = employeeService.getAllEmployee();
		return myEmployee;
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		Employee employee = employeeService.getEmployee(employeeId);
		return employee;
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee emp) {
		employeeService.saveEmployee(emp);
		return emp;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee emp) {
		employeeService.saveEmployee(emp);
		return emp;
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		employeeService.deletEmployee(employeeId);
		return "Deleted Employee id is : "+employeeId;
	}
}

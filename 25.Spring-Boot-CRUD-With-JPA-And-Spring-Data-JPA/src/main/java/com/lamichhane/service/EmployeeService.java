package com.lamichhane.service;

import java.util.List;

import com.lamichhane.entity.Employee;



public interface EmployeeService {
	public List<Employee> getAllEmployee();
   
	public void saveEmployee(Employee theEmployee);

	public Employee getEmployee(int theId);

	public void deletEmployee(int id);
}

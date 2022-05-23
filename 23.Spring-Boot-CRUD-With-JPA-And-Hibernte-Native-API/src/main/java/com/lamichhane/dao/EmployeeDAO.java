package com.lamichhane.dao;

import java.util.List;

import com.lamichhane.entity.Employee;



public interface EmployeeDAO {
	
	public List<Employee> getAllEmployee();

	public void saveEmployee(Employee theEmployee);

	public Employee getEmployee(int theId);

	public void deleteEmployee(int id);
	
}

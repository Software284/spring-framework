package com.lamichhane.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.lamichhane.dao.EmployeeDAO;
import com.lamichhane.entity.Employee;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDao;
	
	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED)
	public List<Employee> getAllEmployee() {
		
		return employeeDao.getAllEmployee();
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED)
	public void saveEmployee(Employee theEmployee) {
		employeeDao.saveEmployee(theEmployee);
		
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED)
	public Employee getEmployee(int theId) {
		
		return employeeDao.getEmployee(theId);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED)
	public void deletEmployee(int id) {
		
		employeeDao.deleteEmployee(id);
		
	}

}

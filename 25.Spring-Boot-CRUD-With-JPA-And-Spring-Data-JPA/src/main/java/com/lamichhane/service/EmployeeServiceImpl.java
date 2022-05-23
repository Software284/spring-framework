package com.lamichhane.service;

import java.util.List;
import java.util.Optional;

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
		
		return employeeDao.findAll();
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED)
	public void saveEmployee(Employee theEmployee) {
		employeeDao.save(theEmployee);
		
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED)
	public Employee getEmployee(int theId) {
		
		Optional<Employee> result = employeeDao.findById(theId);
		Employee theEmployee=null;
		if(result.isPresent()) {
			theEmployee= result.get();
		}
		else {
			throw new RuntimeException("Did not find employee id - "+theId);
		}
		
		return theEmployee;
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED)
	public void deletEmployee(int id) {
		
		employeeDao.deleteById(id);
		
	}

}

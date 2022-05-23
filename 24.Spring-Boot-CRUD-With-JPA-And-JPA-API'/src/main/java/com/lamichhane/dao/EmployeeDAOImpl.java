package com.lamichhane.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lamichhane.entity.Employee;



@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	
	
	public List<Employee> getAllEmployee() {
		Query theQuery = entityManager.createQuery("from Employee order by lastName",Employee.class);
		List<Employee> employees = theQuery.getResultList();
		return employees;
	}


	public void saveEmployee(Employee theEmployee) {
		Employee emp = entityManager.merge(theEmployee);
		theEmployee.setId(emp.getId());
		
	}


	public Employee getEmployee(int theId) {
		Employee theEmployee = entityManager.find(Employee.class, theId);
		return theEmployee;
	}


	
	public void deleteEmployee(int id) {
	    
		Query query = entityManager.createQuery("delete from Employee where id=:theEmployeeId");
		query.setParameter("theEmployeeId", id);
		query.executeUpdate();
		
	}

}

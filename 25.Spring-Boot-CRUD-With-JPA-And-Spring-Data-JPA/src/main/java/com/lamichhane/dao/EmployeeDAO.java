package com.lamichhane.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamichhane.entity.Employee;



@Repository
public interface EmployeeDAO extends JpaRepository<Employee,Integer>{


}

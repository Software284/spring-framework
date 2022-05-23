package com.lamichhane.aop.after.throwing.advice.type;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;



@Component
public class AccountDAO {
	
	
	public void  findAccounts () throws AccountNotFoundException {
	
		throw new AccountNotFoundException("Account Not Exists");
		
	}
	
	
	
}

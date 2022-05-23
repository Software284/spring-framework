package com.lamichhane.aop.after.returning.advice.type;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;



@Component
public class AccountDAO {
	
	
	public List<Account> findAccounts () {
	
		List mylist = new ArrayList();
		mylist.add(new Account("mahesh",4444));
		mylist.add(new Account("nabin",43443));
		return mylist;
		
	}
	
	
	
}

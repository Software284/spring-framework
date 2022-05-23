package com.lamichhane.aop.after.advice.type;

import org.springframework.stereotype.Component;



@Component
public class AccountDAO {
	
	
	public void addAccount() {
		System.out.println(getClass()+": DOING MY DB WORK: ADDING AN ACCOUNT");
		
	}
	
	
	
}

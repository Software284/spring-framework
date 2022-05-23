package com.lamichhane.aop.around.advice.type;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;



@Component
public class AccountDAO {
	
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	
	public String addAccount() throws AccountNotFoundException {
//		myLogger.info(getClass()+": DOING MY DB WORK: ADDING AN ACCOUNT");
		throw new AccountNotFoundException("account not found");
		
	}
	
	
	
}

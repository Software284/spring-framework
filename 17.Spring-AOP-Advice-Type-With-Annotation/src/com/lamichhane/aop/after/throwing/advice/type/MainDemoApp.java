package com.lamichhane.aop.after.throwing.advice.type;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		try {
			theAccountDAO.findAccounts();
		}
		catch(Exception e) {
			System.out.println("Account not found");
		}
	    System.out.println("Main Program");
	   
		context.close();
	}

}

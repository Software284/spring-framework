package com.lamichhane.aop.after.returning.advice.type;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
	    System.out.println("After Returning in main program="+theAccountDAO.findAccounts());
	   
		context.close();
	}

}

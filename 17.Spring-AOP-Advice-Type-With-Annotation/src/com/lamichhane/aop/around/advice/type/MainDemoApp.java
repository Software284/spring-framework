package com.lamichhane.aop.around.advice.type;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
	    String data = null;
		try {
			 theAccountDAO.addAccount();
		} catch (AccountNotFoundException e) {
			data=e.getMessage();
			
		}
	    System.out.println("Main Exception="+data);
		context.close();
	}

}

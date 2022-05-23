package com.lamichhane.aop.after.advice.type;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@After("execution(public void addAccount())")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) 
	{
		System.out.println("\n============>>> Executing @After advice on addAccount()");
	}
	
	// after run before throwing
	
	
	
}

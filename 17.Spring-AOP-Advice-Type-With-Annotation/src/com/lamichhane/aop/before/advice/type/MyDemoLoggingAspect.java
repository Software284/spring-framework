package com.lamichhane.aop.before.advice.type;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class MyDemoLoggingAspect {
	
	
	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n============>>> Executing @Before advice on addAccount()");
	}
	
	
	
	
}

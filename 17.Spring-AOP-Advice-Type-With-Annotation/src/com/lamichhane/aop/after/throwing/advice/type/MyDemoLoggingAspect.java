package com.lamichhane.aop.after.throwing.advice.type;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class MyDemoLoggingAspect {
	
	
	@AfterThrowing(pointcut="execution(* com.lamichhane.aop.after.throwing.advice.type.AccountDAO.findAccounts(..))",throwing="exe")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint,Throwable exe) {
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("Executing @AfterThrowing on method:"+method);
		System.out.println("Exception is  is:"+exe);
	}
	
	
	
	
}

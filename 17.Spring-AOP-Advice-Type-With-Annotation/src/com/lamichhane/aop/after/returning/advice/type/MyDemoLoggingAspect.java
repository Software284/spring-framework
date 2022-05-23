package com.lamichhane.aop.after.returning.advice.type;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class MyDemoLoggingAspect {
	
	
	@AfterReturning(pointcut="execution(* com.lamichhane.aop.after.returning.advice.type.AccountDAO.findAccounts(..))",returning="result")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint,List<Account> result) {
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("Executing @AfterReturning on method:"+method);
		System.out.println("Result is:"+result);
		
		if(!result.isEmpty()) {
			Account tempAccount = result.get(0);
			tempAccount.setName("Hari");
		}
		// we can post process the data before returning to the caller here  
	}
	
	
	
	
}

package com.lamichhane.aop.around.advice.type;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class MyDemoLoggingAspect {
	
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	@Around("execution(public void addAccount())")
	public String aroundAdvice(ProceedingJoinPoint theJoinPoint) throws Throwable 
	{
		String method=theJoinPoint.getSignature().getName();
		myLogger.info("Executing @Around method on:"+method);
		long begin = System.currentTimeMillis();
		
		
		Object result12 = null;
		try {
			result12 = theJoinPoint.proceed();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			result12 = "Major accidents bro don't worry";
//			throw e;
		}
		
		
		long end = System.currentTimeMillis();
		myLogger.info("Total time spend by call ="+(end-begin)+ " milliseconds");
		
		return result12.toString();
		
		
		
	}
	
	// after run before throwing
	
	
	
}

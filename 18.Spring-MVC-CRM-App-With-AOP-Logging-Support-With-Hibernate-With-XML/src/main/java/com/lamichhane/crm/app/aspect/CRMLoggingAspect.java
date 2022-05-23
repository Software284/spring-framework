package com.lamichhane.crm.app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {

	// setup logger
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	
	// setup pointcut declarations
	@Pointcut("execution(* com.lamichhane.crm.app.controller.*.*(..))")
	private void forControllerPackage() {}
	
	@Pointcut("execution(* com.lamichhane.crm.app.service.*.*(..))")
	private void forServicePackage() {}
	
	@Pointcut("execution(* com.lamichhane.crm.app.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Pointcut("forControllerPackage() || forServicePackage() ||  forDaoPackage()")
	private void forAppFlow() {}
	
	

	// add @Before advice
	
	@Before("forAppFlow()")
	public void before(JoinPoint theJoinPoint) {
		
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("=========>> in @Before: calling method: "+theMethod);
		
		Object[] args = theJoinPoint.getArgs();
		
		for(Object tempArg: args) {
			myLogger.info("========> argument: "+tempArg);
		}
	}
	
	// add @AfterReturning 
	
	@AfterReturning(pointcut = "forAppFlow()",returning="theResult")
	public void afterReturning(JoinPoint theJoinPoint,Object theResult) {
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("==========> in @AfterReturning: from method:"+theMethod);
		
		//display data returned 
		myLogger.info("=========>> result: "+theResult);
	}
}

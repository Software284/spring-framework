package com.lamichhane.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Pointcut("execution(* com.lamichhane.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Pointcut("execution(* com.lamichhane.aopdemo.dao.*.set*(..))")
	private void setter() {}
	
	@Pointcut("execution(* com.lamichhane.aopdemo.dao.*.get*(..))")
	private void getter() {}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {}
	
	
	/*
	 *   execution(modifiers-pattern? return-type-pattern? declaring-type-pattern?
	 *   method-name-pattern(param-pattern) throws-pattern?)
	 *   
	 *   ? denoted optional pattern
	 *   * denotes match on everything
	 *   
	 *   for parameter pattern:->
	 *   ()-> matches a method with no arguments 
	 *   (*)-> matches a method with one argument of any type
	 *   (..)-> matches a method with 0 or more arguments of any type
	 */
	
//	@Before("execution(public void addAccount())")
//	@Before("execution(public void com.lamichhane.aopdemo.dao.AccountDAO.addAccount())")
//	@Before("execution(public void add*())")
//	@Before("execution(void add*())")
//	@Before("execution(* add*())")
//	@Before("execution(* add*(com.lamichhane.aopdemo.Account))")
//	@Before("execution(* add*(com.lamichhane.aopdemo.Account,..))")
//	@Before("execution(* add*(..))")
	
	
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n============>>> Executing @Before advice on addAccount()");
		
	}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void performedApiAnalytics() {
		System.out.println("\n============>>> Performing @Before performing api analytics");
		
	}
}

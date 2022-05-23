package com.lamichhane.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LuvAopExpressions {

	
	@Pointcut("execution(* com.lamichhane.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	@Pointcut("execution(* com.lamichhane.aopdemo.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("execution(* com.lamichhane.aopdemo.dao.*.get*(..))")
	public void getter() {}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {}
	
	
}

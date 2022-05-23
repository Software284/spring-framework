package com.lamichhane.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect {
	
	@Before("com.lamichhane.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void performedApiAnalytics() {
		System.out.println("\n============>>> Performing @Before performing api analytics");
		
	}
}

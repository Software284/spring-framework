package com.lamichhane.any.method.dependency.injection.with.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(theCoach.getDaillyWorkout());
		System.out.println(theCoach.getDaillyFortune());
		context.close();

	}

}

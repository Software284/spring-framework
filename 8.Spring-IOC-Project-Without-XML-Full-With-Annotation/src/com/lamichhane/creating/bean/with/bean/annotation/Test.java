package com.lamichhane.creating.bean.with.bean.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach theCoach = context.getBean("swimCoach",Coach.class);
		System.out.println(theCoach.getDaillyWorkout());
		System.out.println(theCoach.getDaillyFortune());
		context.close();

	}

}

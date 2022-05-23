package com.lamichhane.spring.project.with.full.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);
		TennisCoach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		theCoach.setName("Hero");
		System.out.println(theCoach.getDaillyWorkout());
		System.out.println(theCoach.getDaillyFortune());
		context.close();

	}

}

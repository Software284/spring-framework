package com.lamichhane.reading.data.from.properties.file;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		System.out.println(theCoach.getMail());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getDaillyWorkout());
		context.close();

	}

}

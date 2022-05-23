package com.lamichhane.configuration.with.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach1 = context.getBean("myfootballcoach",Coach.class);
		Coach coach2 = context.getBean("cricketCoach",Coach.class);
		System.out.println(coach1.getDaillyWorkout());
		System.out.println(coach2.getDaillyWorkout());

	}

}

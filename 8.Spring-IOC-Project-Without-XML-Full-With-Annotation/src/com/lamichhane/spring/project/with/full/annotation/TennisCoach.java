package com.lamichhane.spring.project.with.full.annotation;


import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private String name;
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDaillyWorkout() {
		
		return name+" Practise your backhand volley";
	}

	@Override
	public String getDaillyFortune() {
		// TODO Auto-generated method stub
		return name+" I am happy today";
	}


}

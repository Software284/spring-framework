package com.lamichhane.field.injection.with.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	
	

	@Override
	public String getDaillyWorkout() {
		
		return "Practise your backhand volley";
	}

	@Override
	public String getDaillyFortune() {
		
		return fortuneService.getFortuneService();
	}

}

package com.lamichhane.qualifier.annotation.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("databaseFortuneService")
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

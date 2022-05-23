package com.lamichhane.setter.injection.with.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDaillyWorkout() {
		
		return "Practise your backhand volley";
	}

	@Override
	public String getDaillyFortune() {
		
		return fortuneService.getFortuneService();
	}

}

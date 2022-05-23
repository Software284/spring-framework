package com.lamichhane.any.method.dependency.injection.with.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
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

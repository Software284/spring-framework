package com.lamichhane.creating.bean.with.bean.annotation;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	

	@Override
	public String getDaillyWorkout() {
		// TODO Auto-generated method stub
		return "swim 1000 meters as a warm up";
	}

	@Override
	public String getDaillyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

}

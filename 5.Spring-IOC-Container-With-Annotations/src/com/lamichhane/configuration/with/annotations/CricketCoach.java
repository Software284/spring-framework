package com.lamichhane.configuration.with.annotations;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDaillyWorkout() {
		return "dailly batting practise on net";
	}

}

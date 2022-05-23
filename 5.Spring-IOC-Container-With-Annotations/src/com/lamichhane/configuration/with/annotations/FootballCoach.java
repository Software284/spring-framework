package com.lamichhane.configuration.with.annotations;

import org.springframework.stereotype.Component;

@Component("myfootballcoach")
public class FootballCoach implements Coach {

	@Override
	public String getDaillyWorkout() {
		return "penalty practise for 30 mins dailly";
	}

}

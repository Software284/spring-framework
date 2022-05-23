package com.lamichhane.reading.data.from.properties.file;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	

	@Value("${foo.email}")
	private String mail;
	
	@Value("${foo.team}")
	private String team;

	public String getMail() {
		return mail;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDaillyWorkout() {
		// TODO Auto-generated method stub
		return "practise pengun style for 30 mins";
	}
	
	

	

	

}

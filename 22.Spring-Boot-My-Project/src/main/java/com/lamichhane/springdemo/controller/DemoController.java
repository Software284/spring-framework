package com.lamichhane.springdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapi")
public class DemoController {
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return coachName+" "+teamName;
	}

	@GetMapping("/")
	public String getHomePage() {
		return "Hello World";
	}
	
	@GetMapping("/name")
	public String getName() {
		return "Mahesh Lamichhane";
	}
}

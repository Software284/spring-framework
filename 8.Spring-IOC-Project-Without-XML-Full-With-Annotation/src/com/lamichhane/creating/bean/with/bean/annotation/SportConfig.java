package com.lamichhane.creating.bean.with.bean.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.lamichhane.creating.bean.with.bean.annotation")
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService() {
		
		SadFortuneService service = new SadFortuneService();
		service.setName("Mahesh");
		return service;
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
}

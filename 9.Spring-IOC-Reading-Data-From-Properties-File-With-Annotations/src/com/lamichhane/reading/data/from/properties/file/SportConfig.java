package com.lamichhane.reading.data.from.properties.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.lamichhane.creating.bean.with.bean.annotation")
@PropertySource("classpath:application.properties")
public class SportConfig {
	
	
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach();
	}
	
	
}

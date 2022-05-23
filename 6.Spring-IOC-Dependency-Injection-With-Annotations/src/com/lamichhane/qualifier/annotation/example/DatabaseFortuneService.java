package com.lamichhane.qualifier.annotation.example;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		
		return "database service";
	}

}

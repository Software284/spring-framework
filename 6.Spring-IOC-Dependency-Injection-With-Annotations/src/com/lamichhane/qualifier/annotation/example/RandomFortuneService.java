package com.lamichhane.qualifier.annotation.example;

import org.springframework.stereotype.Component;

@Component	
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		
		return "random fortune";
	}

}

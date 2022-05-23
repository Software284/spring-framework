package com.lamichhane.qualifier.annotation.example;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "REST API SERVICE";
	}

}

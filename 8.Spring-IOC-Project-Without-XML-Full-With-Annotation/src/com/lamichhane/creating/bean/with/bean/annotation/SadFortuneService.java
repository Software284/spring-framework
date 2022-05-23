package com.lamichhane.creating.bean.with.bean.annotation;

public class SadFortuneService  implements FortuneService{
	
	private String name;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String getFortuneService() {
		return name+" Today is a sad day";
	}

}

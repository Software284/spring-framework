package com.lamichhane.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDAO {
	
//	public void addAccount() {
//		System.out.println(getClass()+":DOING STUFF: ADDING A MMEMBERSHIP ACCOUNT");
//	}
	
//	public void addSillyMember() {
//		System.out.println(getClass()+":DOING STUFF: ADDING A MMEMBERSHIP ACCOUNT");
//	}
	
	public boolean addSillyMember() {
		System.out.println(getClass()+":DOING STUFF: ADDING A MMEMBERSHIP ACCOUNT");
		return true;
	}
	
	public void goToSleep() {
		System.out.println(getClass()+" iam going to sleep see ya buddy");
	}
}

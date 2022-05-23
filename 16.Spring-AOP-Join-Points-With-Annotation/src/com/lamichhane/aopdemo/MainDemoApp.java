package com.lamichhane.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lamichhane.aopdemo.dao.AccountDAO;
import com.lamichhane.aopdemo.dao.MemberShipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		Account ac = new Account();
		ac.setName("Mahesh");
		ac.setLevel("Pro");
		theAccountDAO.addAccount(ac,true);
		theAccountDAO.doWork();
		MemberShipDAO theMemberShipDAO = context.getBean("memberShipDAO",MemberShipDAO.class);
		theAccountDAO.setName("mahesh");
		theAccountDAO.setServiceCode("heeheh");
		theAccountDAO.getName();
		theAccountDAO.getServiceCode();
		
		theMemberShipDAO.addSillyMember();
		theMemberShipDAO.goToSleep();
		context.close();
	}

}

package com.ranjit.SpringCore.referance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		
		
		
	ApplicationContext context=	new ClassPathXmlApplicationContext("congigurationReferance.xml");
	A a = (A)context.getBean("Aref");
	
	System.out.println(a.getX());
	System.out.println(a.getOb().getY());
	
	}

}

package com.ranjit.SpringCore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		
	ApplicationContext context= new ClassPathXmlApplicationContext("congigurationConstructorInjection.xml");
	Person t =(Person) context.getBean("Person1");
	System.out.println(t);
	
	
	// Ambiguity Error
	
	AmbiqutyErrorAdition adition =(AmbiqutyErrorAdition) context.getBean("adition");
	adition.sum();
	
	}
	
	
}

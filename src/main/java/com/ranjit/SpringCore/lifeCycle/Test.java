package com.ranjit.SpringCore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("congigurationLifeCycle.xml");

		// for distory we have to implement sub class of ApplicationContext is
		// AbstractApplicationContext
		// and call registerShutdownHook method
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("congigurationLifeCycle.xml");

//		Samosa samosa = (Samosa) context.getBean("s1");
//		System.out.println(samosa);
//		
//		context.registerShutdownHook();

		System.out.println("???????????????????????????????????");

		Pepsi pepsi = (Pepsi) context.getBean("p1");
		System.out.println(pepsi);
		context.registerShutdownHook();
		
		
		
		System.out.println("???????????????????????????????????");
		System.out.println("???????????????????????????????????");

		
		//Annotation
		
	Example example=(Example)	context.getBean("example");
		System.out.println(example);
		
		

	}
}

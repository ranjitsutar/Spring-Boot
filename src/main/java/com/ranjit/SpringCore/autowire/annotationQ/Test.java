package com.ranjit.SpringCore.autowire.annotationQ;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	    public static void main(String[] args) {
			
	    	ApplicationContext context=	new ClassPathXmlApplicationContext("congigurationAtowire.xml");
	    	Employee emp1=context.getBean("emp2", Employee.class);
	    	System.out.println(emp1);
	    }

}

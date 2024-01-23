package com.ranjit.SpringCore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ranjit/SpringCore/standalone/collection/configurationstandalone.xml");

		Person person = context.getBean("person1", Person.class);
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println(person.getFeeStracture().getClass().getName());

	}

}

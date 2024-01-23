package com.ranjit.SpringCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=	new ClassPathXmlApplicationContext("com/ranjit/SpringCore/stereotype/congiguration.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		System.out.println(student.getFriends().getClass().getName());
	}
}

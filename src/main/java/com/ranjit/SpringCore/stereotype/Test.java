package com.ranjit.SpringCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=	new ClassPathXmlApplicationContext("com/ranjit/SpringCore/stereotype/congiguration.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		System.out.println(student.getFriends().getClass().getName());
		
		
		System.out.println("Bean Scope (singletan)--------------------------");
		
		System.out.println(student.hashCode());
		
		
		Student student2 = context.getBean("student", Student.class);
		System.out.println(student.hashCode());

		
		System.out.println("Bean Scope (ProtoType)--------------------------");

		Teacher teacher = context.getBean("teacher", Teacher.class);
		Teacher teacher2 = context.getBean("teacher", Teacher.class);

		System.out.println(teacher);
		System.out.println(teacher.hashCode());
		System.out.println(teacher2.hashCode());

	}
}

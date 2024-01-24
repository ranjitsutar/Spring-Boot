package com.ranjit.SpringCore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// when we use @Bean, componentScan and component are not required
//@ComponentScan(basePackages = "com.ranjit.SpringCore.javaconfig")
public class JavaConfig {
	
	//retern type should same as bean type or class type
	@Bean
	public Student getStudent() {
		
		return new Student(getSamosa());
	}

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
}

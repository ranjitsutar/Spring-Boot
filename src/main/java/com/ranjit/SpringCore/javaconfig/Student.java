package com.ranjit.SpringCore.javaconfig;

import org.springframework.stereotype.Component;

//@Component("student")
// alternative way
public class Student {

	
	private Samosa samosa;
	
	public void study() {
		this.samosa=samosa;
		System.out.println("study");
		
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}

	
	
}

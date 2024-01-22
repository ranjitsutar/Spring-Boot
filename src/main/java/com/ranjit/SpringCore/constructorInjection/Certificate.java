package com.ranjit.SpringCore.constructorInjection;

public class Certificate {
	
	private String nameString;

	public Certificate(String nameString) {
		super();
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "Certificate [nameString=" + nameString + "]";
	}
	

}

package com.ranjit.SpringCore.autowire;

public class Emp {

	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("constructor Autoeware");
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
	
	
}

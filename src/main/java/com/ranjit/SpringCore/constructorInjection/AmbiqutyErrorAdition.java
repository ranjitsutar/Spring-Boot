package com.ranjit.SpringCore.constructorInjection;

public class AmbiqutyErrorAdition {
	private int a;
	private int b;
	public AmbiqutyErrorAdition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("int.....");
	}
	public AmbiqutyErrorAdition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Double/......");
	}
	
	
	
	public AmbiqutyErrorAdition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b =Integer.parseInt(b);
		System.out.println("Sting cons...");
	}
	public void sum() {
		System.out.println("Sum is= " +(this.a +this.b));
	}
	@Override
	public String toString() {
		return "AmbiqutyErrorAdition [a=" + a + ", b=" + b + "]";
	}
	
	

}

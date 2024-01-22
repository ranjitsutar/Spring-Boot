package com.ranjit.SpringCore.referance;

public class B {

	private int y;
	private A oa;
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	public B(int y, A oa) {
		super();
		this.y = y;
		this.oa = oa;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public A getOa() {
		return oa;
	}
	public void setOa(A oa) {
		this.oa = oa;
	}
	@Override
	public String toString() {
		return "B [y=" + y + ", oa=" + oa + "]";
	}
	
	
}

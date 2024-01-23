package com.ranjit.SpringCore.expressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{2+3}")
	private int x;
	@Value("#{10+20}")
	private int y;
	@Value("#{T(java.lang.Math).E}")
	private double e;

	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double z;
	@Value("#{new java.lang.String('Ranjit')}")
	private String s;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", e=" + e + ", z=" + z + ", s=" + s + "]";
	}


	
}

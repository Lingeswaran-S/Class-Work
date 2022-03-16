package com.te.learn.Inheritance;

public class B extends A {
	private int c = 12;
	private int d = 45;
	
	public B() {
		super();
	}

	public B(int c, int d) {
		super();
		this.c = c;
		this.d = d;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

}

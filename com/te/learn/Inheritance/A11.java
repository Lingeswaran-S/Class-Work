package com.te.learn.Inheritance;

public class A11 {
	private int a = 10;
	private int b = 90;

	public A11() {
		super();
	}

	public void test() {
		System.out.println("Parent exe");
	}

	public A11(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}

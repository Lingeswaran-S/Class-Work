package com.te.learn.Inheritance;

public class B11 extends A11 {
	private int a = 2;
	private int b = 34;

	public B11() {
		super();
	}

	public B11(int a, int b) {
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

	public void test() {
		System.out.println("Child exe");
	}

}

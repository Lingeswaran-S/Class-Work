package com.te.learn.Abc;

public abstract class A {
	int a ;// single line non static initializer
	int b ;// single line non static initializer
	static int c = 22;// single line static initializer
	static int d = 66;// single line static initializer
	

	public A() {
		super();
		System.out.println("Default A constructor");
	}
	
	public A(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Argumented A  constructor");
	}

	

	public static int getC() {
		return c;
	}


	public static void setC(int c) {
		A.c = c;
	}


	public static int getD() {
		return d;
	}


	public static void setD(int d) {
		A.d = d;
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


	

	static {
		System.out.println("A--Static multi liner initializer exe");
	}
	
	{
		System.out.println("A-Non-Static multi liner initializer exe");
	}

	public static void test() {
		System.out.println("Static method exe");
	}

	public void test01() {
		System.out.println("Non-Static method exe");
	}

}

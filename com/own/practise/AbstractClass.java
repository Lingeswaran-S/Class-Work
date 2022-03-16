package com.own.practise;

public abstract class AbstractClass {
	int a;
	int b;
	static int c;
	static int d;
	public AbstractClass() {
		super();
	}
	public AbstractClass(int a, int b) {
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
	public static int getC() {
		return c;
	}
	public static void setC(int c) {
		AbstractClass.c = c;
	}
	public static int getD() {
		return d;
	}
	public static void setD(int d) {
		AbstractClass.d = d;
	}
	public static void absstaticM() {
		System.out.println("absstaticM() called");
	}
	public void nonStaticabsM() {
		System.out.println("nonStaticabsM() called");
	}
	}
	

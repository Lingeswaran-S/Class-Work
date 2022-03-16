package com.te.learn;

public class NonStatic10 {
	
	static int b=10;
	static {
		System.out.println("Static multi line intializer exe");
	}
	public static void staticMethod() {
		System.out.println("Static method got executed");
	}
	int a=10;//Non static single line intializer
	{
		//Non-static muti line intializer
		System.out.println("Non Static Multiline intializer");
	}
	public void nonStaticMethod() {
		System.out.println("Non static method executed");
	}

	public static void main(String[] args) {
		System.out.println("main Method executed");
		NonStatic10 nso=new NonStatic10();
		staticMethod();
		System.out.println("Finished");
		

	}

}

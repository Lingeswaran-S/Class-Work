package com.te.learn;

public class Sic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method exe");
		Sic sic=new Sic();
		sic.demoNonStaticMethod();
		demoStaticMethod();

	}
	public static void demoStaticMethod() {
		System.out.println("demoStaticMethod initializer exe");

	}
	static {
		System.out.println("Multi line initializer exe");
	}
	static int a=10;
	
	public void demoNonStaticMethod() {
		System.out.println("demoNonStaticMethod initializer exe");

	}


}

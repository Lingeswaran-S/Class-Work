package com.te.learn;

public class ConstructorPrac {
	// Non static variable=Non static single line intializer
	int a = 12;
	int b = 23;
	{
		System.out.println("Non static multiline intializer executed");
	}

	public ConstructorPrac() {
		// 1.Non-static members will get loaded in the object
		// (Loading variables with deafault values+method references)
		// .non static initializer will get executed
		// 3.Programmer instructioon executed
		System.out.println("1 st construcor");
	}
	

	public ConstructorPrac(int a) {
		//this();
		this.a=a;
		System.out.println("Second constructor");
	}
	public ConstructorPrac(int a, int b) {
		this(a);
		this.b=b;
		System.out.println("3 constructor");
	}
	

	public static void main(String[] args) {
		System.out.println("main(String[] args) method got executed");
		ConstructorPrac cp = new ConstructorPrac(1, 2);
		System.out.println(cp.a);
		System.out.println(cp.b);

	}

}

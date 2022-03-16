package com.te.learn.Inheritance;

public class InheritApp {

	public static void main(String[] args) {
		System.out.println("---------------");
		// upcast B to A
		A a = new B();
		C c = (C) a;
		System.out.println(c.getA());
		System.out.println(c.getB());
//		//downcast A to B
//		//B b=(B)new A();
//		B b=(B) a;
//		//System.out.println(b.getC());
//		//upcast
//		B bc=new C();
//		System.out.println(bc.getA());
//		A ac=new C();//upcast
//		System.out.println(ac.getA());
//		System.out.println(ac.getB());
//		C ca= C ac;
//		System.out.println(ac.getC());

	}

}

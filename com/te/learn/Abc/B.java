package com.te.learn.Abc;

public class B extends A {
	int ba;
	int bb;
	public B() {
		super(12,34);
		System.out.println("Default B  constructor");
	}
	public B(int ba, int bb) {
		super(12,22);
		this.ba = ba;
		this.bb = bb;
		System.out.println("Argumented B constructor called ");
	}
	public int getBa() {
		return ba;
	}
	public void setBa(int ba) {
		this.ba = ba;
	}
	public int getBb() {
		return bb;
	}
	public void setBb(int bb) {
		this.bb = bb;
	}
	
	
	

}

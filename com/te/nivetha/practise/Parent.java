package com.te.nivetha.practise;

public class Parent {
	String parentName;
	int age;
	
	public Parent() {
		super();
		System.out.println("Parent class constructor");
	}

	public Parent(String parentName, int age) {
		super();
		this.parentName = parentName;
		this.age = age;
		System.out.println("Parent class argument constructor");
	}
	

}

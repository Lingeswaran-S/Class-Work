package com.te.learn.finalpractise;

public class Person  {
	private int age;
	private String name;
	private Adress address;
	public Person() {
		super();
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Adress getAddress() {
		return address;
	}
	public void setAddress(Adress address) {
		this.address = address;
	}
	

}

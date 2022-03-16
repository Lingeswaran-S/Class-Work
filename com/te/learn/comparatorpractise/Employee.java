package com.te.learn.comparatorpractise;

public final class Employee {
	private String eName;
	private int eID;

	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eID=" + eID + ", salaray=" + salaray + ", age=" + age + "]";
	}

	private int salaray;
	private int age;

	public Employee() {
		super();
	}

	public Employee(String eName, int eID, int salaray, int age) {
		super();
		this.eName = eName;
		this.eID = eID;
		this.salaray = salaray;
		this.age = age;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public int getSalaray() {
		return salaray;
	}

	public void setSalaray(int salaray) {
		this.salaray = salaray;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

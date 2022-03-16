package com.te.learn.collectionPractise;

public class Student {
	private int sID;
	private String sName;
	private int sAge;
	public Student() {
		super();
	}
	public Student(int sID, String sName, int sAge) {
		super();
		this.sID = sID;
		this.sName = sName;
		this.sAge = sAge;
	}
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	@Override
	public String toString() {
		return "Student [sID=" + sID + ", sName=" + sName + ", sAge=" + sAge + "]";
	}
	

}

package com.own.practise;

public class Chilld11 extends Parent11 {
	private String childName;
	private int childAge=super.getParentAge();
	public Chilld11() {
		super();
	}
	public Chilld11(String childName, int childAge) {
		super();
		this.childName = childName;
		this.childAge = childAge;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public int getChildAge() {
		return childAge;
	}
	public void setChildAge(int childAge) {
		this.childAge = childAge;
	}
	@Override
	public String toString() {
		return "Chilld11 [childName=" + childName + ", childAge=" + childAge + "]";
	}
	

}

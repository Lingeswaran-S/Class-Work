package com.te.learn.finalpractise;

public class Adress extends Person {
	@Override
	public String toString() {
		return "Adress [streetName=" + streetName + ", dorNo=" + dorNo + "]";
	}
	private String streetName;
	private int dorNo;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getDorNo() {
		return dorNo;
	}
	public void setDorNo(int dorNo) {
		this.dorNo = dorNo;
	}
	public Adress(String streetName, int dorNo) {
		super();
		this.streetName = streetName;
		this.dorNo = dorNo;
	}
	public Adress() {
		super();
	}

}

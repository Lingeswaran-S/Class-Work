package com.learn.te.relationship;

public class Address {
	private int doorNo;
	private String streetName;
	private int postCode;

	public Address() {
		super();
	}

	public Address(int doorNo, String streetName, int postCode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.postCode = postCode;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

}

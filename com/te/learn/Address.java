package com.te.learn;

public class Address {
	private int doorNo;
	private String cityName;
	private String streetName;
	
	public Address() {
		super();
	}
	public Address(int doorNo, String cityName, String streetName) {
		super();
		this.doorNo = doorNo;
		this.cityName = cityName;
		this.streetName = streetName;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

}

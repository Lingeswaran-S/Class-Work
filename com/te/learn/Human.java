package com.te.learn;

public class Human {
	private String humanName;
	private int humanAge;
	private double humanWeight;
	private int humanHeight;
	private Address address;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	public Human(String humanName, int humanAge, double humanWeight, int humanHeight) {
		super();
		this.humanName = humanName;
		this.humanAge = humanAge;
		this.humanWeight = humanWeight;
		this.humanHeight = humanHeight;
	}

	public Human() {
		super();
	}

	public String getHumanName() {
		return humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public int getHumanAge() {
		return humanAge;
	}

	public void setHumanAge(int humanAge) {
		if (humanAge < 0) {
			System.out.println("Not a valid Age");
		} else {
			this.humanAge = humanAge;
		}

	}

	public double getHumanWeight() {
		return humanWeight;
	}

	public void setHumanWeight(int humanWeight) {
		if (humanWeight < 3) {
			System.out.println("Not a valid Weight");
		} else {
			this.humanWeight = humanWeight;
		}

	}

	public int getHumanHeight() {
		return humanHeight;
	}

	public void setHumanHeight(int humanHeight) {
		if (humanHeight < 3) {
			System.out.println("Not a valid height");
		} else {
			this.humanHeight = humanHeight;
		}

	}
	public Address createAddressObj() {
		return new Address();
	}

}

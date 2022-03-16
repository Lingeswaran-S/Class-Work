package com.te.learn.set;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sAge;
		result = prime * result + sID;
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sAge != other.sAge)
			return false;
		if (sID != other.sID)
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		return true;
	}

}

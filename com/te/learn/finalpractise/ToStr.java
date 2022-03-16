package com.te.learn.finalpractise;

public class ToStr {

	private String name;
	private int age;
	private String areaName;

	public ToStr() {
		super();
	}

	@Override
	public String toString() {
		return "ToStr [name=" + name + ", age=" + age + ", areaName=" + areaName + "]";
	}

	public ToStr(String name, int age, String areaName) {
		super();
		this.name = name;
		this.age = age;
		this.areaName = areaName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Override
	public boolean equals(Object obj) {
		ToStr human = (ToStr) obj;
		if (this.age == human.age) {
			return true;

		}return false;
	}

}

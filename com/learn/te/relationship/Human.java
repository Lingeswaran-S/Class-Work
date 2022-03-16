package com.learn.te.relationship;

public class Human {
	private int age;
	private String name;
	private int weight;
	private Address add = new Address();

	public Human() {
		super();
	}

	public Human(int age, String name, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Human [age=" + age + ", name=" + name + ", weight=" + weight + ", add=" + add + "]";
	}

}

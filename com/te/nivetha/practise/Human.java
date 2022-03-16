package com.te.nivetha.practise;

public class Human {
	
	String name;
	int age;
	double weight;
	Human(){
		System.out.println("default contructor");
	}
	Human(String name,int age){
		this();
		this.name=name;
		this.age=age; 
	}
	Human(String name, int age, double weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
		
	}
	@Override
	public String toString() {
		//return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
		return "ji";
	}
	
	
	

}

package com.te.learn.overriding;

public class Check {

	public static void main(String[] args) {
		Miui mi=new Miui("MIUI","8A dual",170);
		Oxygen ox=new Oxygen();
		mi.setWeight(15);
		
		System.out.println(mi.toString());
		System.out.println(mi.hashCode());
		System.out.println(mi.equals(ox));
		
		

	}

}

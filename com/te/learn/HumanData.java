package com.te.learn;

public class HumanData {
	
	public static void main(String[] args) {
		Human ob = new Human();
		ob.setHumanName("Lingeswaran");
		ob.setHumanAge(22);
		ob.setHumanHeight(155);
		ob.setHumanWeight(-70);
		System.out.println(ob.getHumanName());
		System.out.println(ob.getHumanAge());
		System.out.println(ob.getHumanHeight());
		System.out.println(ob.getHumanWeight());
		Human ob2=new Human();
		ob2.setAddress(ob2.createAddressObj());
		
		ob2.setAddress(new Address());
		System.out.println(ob2.getAddress());

	}

}

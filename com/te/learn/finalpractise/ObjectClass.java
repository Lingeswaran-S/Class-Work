package com.te.learn.finalpractise;

public class ObjectClass {

	public static void main(String[] args) {
		ToStr ob1 = new ToStr("Linges", 32, "nehrt");
		ToStr ob2 = new ToStr();
		ob2.setName("Arjun");
		ob2.setAge(23);
		ob2.setAreaName("Sathy");
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println("Is equals " + ob1.equals(ob2));

	}

}

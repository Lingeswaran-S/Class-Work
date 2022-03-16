package com.te.learn.comparatorpractise;

import java.io.*;

class Demo implements Serializable {
	int a;
	int b;
	String name;

	public Demo() {
		super();
	}

	public Demo(int a, int b, String name) {
		super();
		this.a = a;
		this.b = b;
		this.name = name;
	}
}

public class Serial {
	public static void main(String[] args) {
		Demo ob = new Demo(12, 15, "Blue");
		System.out.println(ob.a);
		String fileName = "D:\\ss.ser";
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(ob);
			System.out.println("Object Serialized");
		} catch (Exception ex) {
			System.out.println("Exception Ocuured");
		}

		Demo ob1 = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			ob1 = (Demo) in.readObject();
			System.out.println("Object DeSerialized");
			System.err.println(ob1.b);
		} catch (Exception ex) {
			System.out.println("Exception Ocuured");
		}

	}

}

package com.le.own.serial;

import java.io.*;

class Demo implements Serializable {
	String name;
	transient int weight;
	int age;
	static int blue=12;

	public Demo(String name, int age,int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight=weight;
	}

}

public class Main {
	public static void main(String[] args) {
		Demo ob=new Demo("Linges",21,70);
		String filename="D:\\hi.ser";
		 try
	        {   
	            //Saving of object in a file
	            FileOutputStream file = new FileOutputStream(filename);
	            ObjectOutputStream out = new ObjectOutputStream(file);
	              
	            // Method for serialization of object
	            out.writeObject(ob);
	              
	            out.close();
	            file.close();
	              
	            System.out.println("Object has been serialized");
	  
	        }
		 catch(Exception ex)
	        {
	            System.out.println("IOException is caught");
	        }
		 Demo ob1=null;
		 try {
			 FileInputStream file=new FileInputStream(filename);
			 ObjectInputStream read=new ObjectInputStream(file);
			 ob1=(Demo)read.readObject();
			 System.out.println(ob1.weight);
		 }catch(Exception ex){
			 
		 }
		
		
	}
}

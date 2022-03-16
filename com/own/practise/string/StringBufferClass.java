package com.own.practise.string;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer strBuff=new StringBuffer("Software Engineer");
		StringBuilder strBuild=new StringBuilder("Engineer");
		System.out.println(strBuff);
		System.out.println("Length: "+strBuff.length());
		System.out.println(strBuff.indexOf("ng"));
		System.out.println(strBuff.replace(1,2,  "oooo"));
		
		System.out.println(strBuff.insert(1,"oooo"));
		
		
		
	}
}

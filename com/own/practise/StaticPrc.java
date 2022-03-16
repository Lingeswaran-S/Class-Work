package com.own.practise;
public class StaticPrc {
	static int a=10;
	public static void main(String[] args) {
		System.out.println("main Method executed");
	}
	static {
		System.out.println("Multi line intializer executed");
	}
}

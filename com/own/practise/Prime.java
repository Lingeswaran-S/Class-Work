package com.own.practise;

public class Prime {

	public static void main(String[] args) {
		int n=2;
		if(n!=2) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("Not a Prime");
				break;
			}else {
				System.out.println("Prime number");
				break;
			}
		}}else {
			System.out.println("Prime number");
		}
		
	}

}

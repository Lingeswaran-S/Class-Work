package com.own.practise;

public class Pattern092 {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

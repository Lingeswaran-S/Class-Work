package com.own.practise;

public class IntPalindrome {

	public static void main(String[] args) {
		int n=44443;
		int ref=n;
		int rem;
		int ans=0;
		while(0<n) {
			rem=n%10;
			ans=(ans*10)+rem;
			n=n/10;	
		}
		if(ans==ref) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		

	}

}

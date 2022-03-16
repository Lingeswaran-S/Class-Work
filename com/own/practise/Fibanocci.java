package com.own.practise;

public class Fibanocci {

	public static void main(String[] args) {
		int n=10,c;
		int a=0;
		int b=1;
		if(n==1) {
			System.out.println(a);
		}else if(n==2) {
			System.out.println(a +" "+b);
		}else {
			System.out.print(a +" "+b+" ");
			while(n-2>0) {
				c=a+b;
//				temp=a;
//				a=b;
//				b=temp;
				a=b;
				b=c;
				
				System.out.print(" "+c+" ");
				n--;
				
				
			}
		}

	}

}

package com.own.practise;

public class AmstrongNum {

	public static void main(String[] args) {
		int n=163;
		int ans=0;
		double d;
		int ref=n;
		int p=0;
		while(n>0) {
			p=p+1;
			n=n/10;
		}
		n=ref;
		//while()
//		System.out.println(p);
//		System.out.println(n);
		while(n>0) {
			d=n%10;
			ans=(int) (ans+Math.pow(d,p));
			n=n/10;
		}
		if(ref==ans) {
		System.out.println(ans+" Is Amstrong number");
		}
		else {
			System.out.println(ans+" Is Not a Amstrong number");
		}
		

	}

}

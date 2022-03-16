package com.excep;

import java.util.Scanner;

public class App{
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Age ");
		int age = input.nextInt();
		if (age < 0) {
			throw new UncheckedException("Age lesss");
		}
		System.out.println("Age : "+age);
	}

}

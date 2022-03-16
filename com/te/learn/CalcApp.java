package com.te.learn;

import java.util.Scanner;

public class CalcApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("-------------------------------------------");
		do {

			System.out.println(".....Welcome to Calculator Application....");
			System.out.println(".....Enter option as your requirement....");
			System.out.println("-------------------------------------------");
			System.out.println("1-Addition");
			System.out.println("2-Subraction");
			System.out.println("3-Multiplication");
			System.out.println("4-Division");
			System.out.println("5-exit");
			System.out.println("-------------------------------------------");
			int option = input.nextInt();
			int a, b;
			if (option == 1 || option == 2 || option == 3 || option == 4) {
				System.out.println("Enter a First number");
				a = input.nextInt();
				System.out.println("Enter a Second number");
				b = input.nextInt();
				System.out.println("-------------------------------------------");
				switch (option) {

				case 1: {

					System.out.println("your Result :" + Calculator.addNum(a, b));
					break;
				}
				case 2: {

					System.out.println("your Result :" + Calculator.subNum(a, b));
					break;
				}
				case 3: {
					System.out.println("your Result :" + Calculator.multipleNum(a, b));
					break;
				}
				case 4: {
					System.out.println("your Result :" + Calculator.divideNum(a, b));
					break;
				}
				}
				System.out.println("-------------------------------------------");

			} else if (option == 5) {
				System.out
						.println("Thank yoy ....\nWe are really miss you BUDDY....\n-----------STAY SAFE------------ ");
				break;
			} else {
				System.out.println("Opps!......\nPlease...Enter valid option");
			}

		} while (true);
		input.close();
	}
}

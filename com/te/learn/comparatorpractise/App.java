package com.te.learn.comparatorpractise;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Comparator;

public class App {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
				
		Employee[] emp = { new Employee("Linges", 101, 10000, 19), new Employee("Karthi", 102, 12000, 18),
				new Employee("Boopal", 103, 1000, 20), new Employee("Arun", 104, 7000, 17) };
//		System.out.println("Before sort");
//		for (Employee employee : emp) {
//			System.out.println(employee);
//		}
//		System.out.println("After sort CompareBasedOnAge() ");
//		Arrays.sort(emp,new CompareBasedOnAge());
//		for (Employee employee : emp) {
//			System.out.println(employee);
//		}
//		System.out.println("After sort CompareBasedOnSalary() ");
//		Arrays.sort(emp,new CompareBasedOnSalary());
//		for (Employee employee : emp) {
//			System.out.println(employee);
		Comparator compAge = (Object o1, Object o2) -> {
			Employee e1 = (Employee) o1;
			Employee e2 = (Employee) o2;
			if (e1.getAge() > e2.getAge())
				return 1;
			else if (e1.getAge() < e2.getAge())
				return -1;

			return 0;
		};
		Comparator compSalary = (Object o1, Object o2) -> {
			Employee e1 = (Employee) o1;
			Employee e2 = (Employee) o2;
			if (e1.getSalaray() > e2.getSalaray())
				return 1;
			else if (e1.getSalaray() < e2.getSalaray())
				return -1;

			return 0;
		};
		boolean control=true;
		do {
			System.out.println("Enter sort Option........");
			System.out.println("1-Based on Age \n 2-Based on Salary \n  3-Exit");
			int option=input.nextInt();
			switch(option) {
			case 1:{
				Arrays.sort(emp,compAge);
				for (Employee employee : emp) {
					System.out.println(employee);
				}
				break;
			}case 2:{
				Arrays.sort(emp,compSalary);
				for (Employee employee : emp) {
					System.out.println(employee);
				}
				break;
			}
			case 3:{
				control=false;
				System.out.println("Thank You......");
				break;
			}default:{
				
				System.out.println("Enter valid...Option ?");
				break;
			}
			
			
			}
			
			
			
		}while(control);
		

	}

}

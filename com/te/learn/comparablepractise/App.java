package com.te.learn.comparablepractise;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		Student[] studentList = { new Student("Linges", 101, 20), new Student("Arun", 102, 19),
				new Student("karthi", 103, 22), new Student("boopal", 102, 21) };
		System.out.println("Before sorting");
		System.out.println("----------------------------------");
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("----------------------------------");
		System.out.println("After sorting");
		Arrays.sort(studentList);

		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("----------------------------------");

	}

}

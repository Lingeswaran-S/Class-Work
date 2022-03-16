package com.te.learn.collectionPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList();
		studentList.add(new Student(1, "Name01", 18));
		studentList.add(new Student(2, "Name02", 19));
		studentList.add(new Student(6, "Name04", 22));
		studentList.add(new Student(8, "Name05", 15));
		System.out.println(studentList);
		// 1st iterate using for
		System.out.println("--------------------");
		System.out.println("1st iterate using for");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));

		}
		// 2 nd iterate using for each
		System.out.println("--------------------");
		System.out.println("2nd iterate using for-each");
		for (Student student : studentList) {
			System.out.println(student);

		}
		// 3 rd iterate using for each
		System.out.println("--------------------");
		System.out.println("3rd iterate using Iterator");
		Iterator iterator = studentList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("--------------------");
		System.out.println("4th iterate using ListIterator");
		ListIterator listIterator = studentList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}
		System.out.println("--------------------");
		System.out.println("5th iterate using ListIterator");

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());

		}

	}

}

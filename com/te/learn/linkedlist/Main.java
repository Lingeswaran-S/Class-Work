package com.te.learn.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		LinkedList<Student> studentList = new LinkedList();
		studentList.add(new Student(1, "sanooj", 22));
		studentList.add(new Student(2, "sanooj01", 19));
		studentList.add(new Student(3, "sanooj02", 22));
		studentList.add(new Student(4, "sanooj03", 99));
		System.out.println("1 st --------------using For");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));

		}
		System.out.println("2 nd --------------using For Each");
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("3 rd --------------using Iterator");
		Iterator iterator = studentList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("4 th --------------using List iterator");
		ListIterator listIt = studentList.listIterator();
		while (listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		System.out.println("5 th --------------using prevoioys iterator");
		while(listIt.hasPrevious()){
			System.out.println(listIt.previous());
			
		}

	}

}

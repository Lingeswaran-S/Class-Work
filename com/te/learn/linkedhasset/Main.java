package com.te.learn.linkedhasset;

import java.util.LinkedHashSet;

import com.te.learn.linkedlist.Student;

public class Main {

	public static void main(String[] args) {
		LinkedHashSet<Student> stuList=new LinkedHashSet<Student>();
		stuList.add(new Student(1, "sanooj", 22));
		stuList.add(new Student(2, "sanooj02", 22));
		stuList.add(new Student(2, "sanooj02", 22));
		stuList.add(new Student(4, "sanooj03", 99));
		for (Student student : stuList) {
			System.out.println(student);
		}

	}

}

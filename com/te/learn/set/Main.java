package com.te.learn.set;
import java.util.HashSet;
public class Main {
	public static void main(String[] args) {
//		HashSet<Integer> intlist=new HashSet();
//		intlist.add(4);
//		intlist.add(1);
//		intlist.add(15);
//		intlist.add(23);
//		
//		for (Integer integer : intlist) {
//			System.out.println(integer);
//		}
//		
		System.out.println("-------------------\n------------------");
		HashSet<Student> studentList = new HashSet<Student>();
		studentList.add(new Student(3, "sanooj", 21));
		studentList.add(new Student(1, "sanooj01", 22));
		studentList.add(new Student(1, "sanooj01", 22));
		studentList.add(new Student(5, "sanooj", 24));
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

}

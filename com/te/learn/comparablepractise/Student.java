package com.te.learn.comparablepractise;

public class Student implements Comparable {
	private String studentName;
	private int studentID;
	private int age;

	public Student() {
		super();
	}

	public Student(String studentName, int studentID, int age) {
		super();
		this.studentName = studentName;
		this.studentID = studentID;
		this.age = age;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentID=" + studentID + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object obj) {
		Student stu = (Student) obj;
		if (this.age > stu.age)
			return -1;
		else if (this.age < stu.age)
			return 1;
		return 0;
	}

}

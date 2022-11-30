package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentname() {
		System.out.println("The student name is ");

	}
	public void studentdep() {
		System.out.println("The student department is ");

	}
	public void studentid() {
		System.out.println("The student ID is");

	}

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.collegecode();
		stu.collegename();
		stu.collegerank();
		stu.depname();
		stu.studentdep();
		stu.studentid();
		stu.studentname();

	}

}

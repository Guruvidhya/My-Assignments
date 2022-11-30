package org.system;

public class Student {
	public void getstudentinfo(int id) {
	System.out.println("ID of the student is " + id);

	}
	public void getstudentinfo(int id, String name) {
		System.out.println("The ID and name are" + "  " +id + "  " +name);

	}
	public void getstudentinfo(String email, String phonenumber) {
		System.out.println("The email and phone number are" + "  " +email + "  " + phonenumber);

	}

	public static void main(String[] args) {
	 Student st = new Student();
	 st.getstudentinfo(516686);
	 st.getstudentinfo(516686, "Guruvidhya");
	 st.getstudentinfo("abc@gmail.com", "9500940696");

	}

}

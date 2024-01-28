package com.arya.main;

import com.arya.pojos.Student;

public class MainStudent {
	
	public static void main(String[] args) {
		Student student = new Student();
		
		Student student1 = new Student(1, "Ankit ", (byte) 21 );
		
		Student student2 = new Student(10);
		
		new Student();
		
		student.printProperties();
		student1.printProperties();
		student2.printProperties();
	}
	
}

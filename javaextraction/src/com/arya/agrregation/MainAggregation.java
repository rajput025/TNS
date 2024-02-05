package com.arya.agrregation;

import com.arya.aggregation.address.Address;
import com.arya.aggregation.student.Student;

public class MainAggregation {
	
	public static void main(String[] args) {
		Student Ankit = new Student();
		Ankit.setRollNo(1);
		Ankit.setName("Ankit");
		Ankit.setAge((byte)20);
		Ankit.setAddress(new Address("Pink City", 3210001, "Hawa Mahal", true));
		
		System.out.println(Ankit);
		
		Address address = new Address();
		address.setCity("Jaipur");
		address.setLandMark("Hawa Mahal");
		address.setPincode(3210001);
		address.setCurrentAddress(false);
		
		Ankit.setAddress(address);
		
		System.out.println(Ankit.getAddress().getCity());
		
		
		
		Student sachin = new Student();
		
		sachin.setRollNo(2);
		sachin.setName("Sachin");
		sachin.setAge((byte)20);
		
		sachin.setAddress(new Address ("Blue City", 210001, "Mahal", true));
		
		Address sachinAddress = sachin.getAddress();
		
		
		System.out.println(sachinAddress.getCity());
	}

}

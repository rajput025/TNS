package com.arya.encapsulation.entities;

public class Student {
	
	private int rollNo;
	private String name;
	private byte age;
	
	// setter for rollNo
	// Setters and getters must be public
	public void setRollNo(int rollNo) {
		if(rollNo>0)
		this.rollNo=rollNo;	
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(byte age) {
		this.age=age;
	}
	
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public byte getAge() {
		return age;
	}
	//Override
	public String toString() {
		return "Roll No:" + rollNo + " Name:" + name + " Age:" + age;
	}
}

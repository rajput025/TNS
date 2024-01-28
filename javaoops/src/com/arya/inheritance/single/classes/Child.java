package com.arya.inheritance.single.classes;

public class Child extends Parent {
	String firstName;
	
	public Child() {
		super();
	}
	
	//Variable Shadowing
	public Child(String firstName,String lastName) {
		super(lastName);
		this.firstName=firstName;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Child [FirstName=" + firstName + "]";
	}
	
	
	

}

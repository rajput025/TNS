package com.arya.inheritance.single;

import com.arya.inheritance.single.classes.Child;

public class MainChild {
	public MainChild() {
		Child child=new Child();
		child.setFirstName("Kabir");
		child.setLastName("Ahlawat");
		System.out.println(child.getFirstName() + child.getLastName());
		
		//Constructor 
		//Child child1 = new Parent();
		
		Child child2 = new Child("Raj", "Singhaniya");
		System.out.println(child2);
	}
}

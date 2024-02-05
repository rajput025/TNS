package com.arya.autoboxing;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		String msg = "10";
		Integer number1 = new Integer("10");
		
		Integer number4 = Integer.parseInt("120");
		
		//SCP/SLP
		Integer number2 = 10;
		
		//autoBoxing
		int value=10;
		Integer number3=value;
		
		//autoUnboxing
		int value1= number3;
		
		System.out.println(number3);
	}

}

package com.arya.scanner.utility;

import java.util.Scanner;

public class ScannerUtility {

	public void acceptNumbers() {
		
		try(Scanner scanner = new Scanner (System.in)){
		System.out.println("Enter an Integer number:");
		System.out.println("Number is = "+ scanner.nextInt());
		
		System.out.println("Enter an Floating number:");
		System.out.println("Number is = "+ scanner.nextFloat());
	}
}


public void acceptCharacters() {
	try(Scanner scanner = new Scanner(System.in)){
		System.out.println("Enter a Character:");
		System.out.println(scanner.next().charAt(0));
		System.out.println("Enetr Name:");
		System.out.println(scanner.next());
		
		System.out.println("Enter an Address:");
		scanner.nextLine();
		System.out.println(scanner.nextLine());
		}
	}
}
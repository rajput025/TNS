package com.arya.exception;

import java.util.Scanner;

public class FinallyDemo {
// use finally for release resources
	public static void main(String[] args) {
//		try {
//			System.out.println(10/1);
//			System.exit(0);
//		}finally {
//			System.out.println("Finaly Block");
//			try {
//				
//			}catch(Exception e) {
//				// TODO: handle exception
//			}

//		}
//		}catch(ArithmeticException e) {
//			
//		}		

		try(Scanner scanner = new Scanner(System.in)){
			int number = scanner.nextInt();
		}catch(NumberFormatException numberFormatException) {
			System.out.println(numberFormatException.getMessage());
		}
	}
}

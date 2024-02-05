package com.arya.bank;

import com.arya.bank.entities.Account;
import com.arya.bank.utility.BankUtility;

public class BankApp {
	
	public static void main(String[] args) {
		Account account = new Account(1001, "Ankit", 100000);
		BankUtility utility = new BankUtility();
		
	
		String depositMessage = utility.deposit(account,1000);
		if(depositMessage == "Success")
			System.out.println(account);
		else
			System.out.println(depositMessage);
		String withdrawMessage = utility.withdraw(account,99500);
		if(withdrawMessage == "Successful")
			System.out.println(account);
		else
			System.out.println(withdrawMessage);
		
	}

}

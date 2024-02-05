package com.arya.bank.utility;

import com.arya.bank.entities.Account;
import com.arya.bank.entities.Valid;
import com.arya.bank.interfaces.Bank;

public class BankUtility {
	public String deposit(Account account, float amount) {
		Bank bankDeposit = (account1, amount1) -> {
			if(amount1<=Bank.DEPOSIT_LIMIT	) {
				account1.setBalance(account1.getBalance()+amount1);
				return "Deposit Successfully";
			}else
				return "Unsuccessfull Transction..";
		};
		
		if (account instanceof Valid)
			return bankDeposit.transction(account, amount);
		else
			return"Invalid account";
	}
	public String withdraw(Account account, float amount) {
		Bank bankwithdraw = (account1, amount1) -> {
			if(Bank.MIN_BALANCE < account.getBalance()-amount1) {
				account1.setBalance(account1.getBalance()+amount1);
				return "Withdraw Successfully";
			}else {
				return "Unsuccessfull Transction..";
			}
		};
		
		if (account instanceof Valid) {
			return bankwithdraw.transction(account, amount);
		}else
			return"Invalid account";
	}	
}

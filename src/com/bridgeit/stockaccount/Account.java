package com.bridgeit.stockaccount;

public class Account {

	private double accountBalance = 10000;

	public void withdraw(double amount) {
		
		if (amount < accountBalance) {
			accountBalance = accountBalance-amount;
			System.out.println(amount+" debited from account and remaining balance : " + accountBalance);
		} else
			System.out.println("Debit amount exceeded account balance : " + accountBalance);
	}

}

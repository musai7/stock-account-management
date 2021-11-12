package com.bridgeit.stockaccount;

public class Account {

	double accountBalance = 100000;
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void withdraw(double amount) {
		Account account = new Account();
		if (amount < accountBalance) {
			accountBalance = accountBalance-amount;
			account.setAccountBalance(accountBalance);
			System.out.println(amount+" debited from account and remaining balance : " + accountBalance);
		} else
			System.out.println("Debit amount exceeded account balance : " + accountBalance);
	}
	
	public void credited(double amount) {
			
		Account account = new Account();
		this.accountBalance = accountBalance+amount;
		account.setAccountBalance(accountBalance);
		System.out.println(amount+" debited from account and remaining balance : " + accountBalance);
	}

}

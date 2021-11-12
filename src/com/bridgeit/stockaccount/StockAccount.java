package com.bridgeit.stockaccount;

public interface StockAccount {
	
		void stockAccount(String fileName);

		double valueOf();
		
		void buy(double amount,int noOfShares);
		
		void sell(double amount,int noOfShares);
		
		void printReport();
}

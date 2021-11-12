package com.bridgeit.stockaccount;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

public class StockAccountImpl implements StockAccount {	
	
	Stock stock = new Stock();
	public int noOfShares;
	public String symbol;
	
	private List<StockAccountImpl> accStockAccountImpls;
		
	public  StockAccountImpl() {
		accStockAccountImpls = new ArrayList<>();
	}
	
	
	public int getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	

	@Override
	public String toString() {
		return "StockAccountImpl [noOfShares=" + noOfShares + ", symbol=" + symbol + "]";
	}
	
	@Override
	public void stockAccount(String fileName) {

		String str ="200 $ ";
		String str1 ="300 $ ";
		
		try {
			BufferedWriter writer; writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(str);
			writer.write(str1);
			writer.close();
		} catch (IOException e) {
		}
	}
	
	@Override
	public double valueOf() {
		String filePath = "C:\\Users\\musai\\rfp-java\\practice\\shankar rpf-80\\stock-account-management\\stockAccount";
		List<String> lines = new ArrayList<String>();
		Path path = Paths.get(filePath);
		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		StockAccountImpl accountImpl = new StockAccountImpl();
		Account account = new Account();
		for (String line : lines) {
			
			String[] words = line.split(" ");
			accountImpl.setNoOfShares(Integer.valueOf(words[0]));
			accountImpl.setSymbol(words[1]);
			accStockAccountImpls.add(accountImpl);
		}
		System.out.println(accStockAccountImpls);
		return accountImpl.getNoOfShares()*100;

	}

	@Override
	public void buy(double value, int noOfShares) {
		StockAccountImpl accountImpl = new StockAccountImpl();
		Account account = new Account();
		account.withdraw(value);
		accountImpl.setNoOfShares(accountImpl.getNoOfShares()-noOfShares);
		System.out.println(accStockAccountImpls);
	}

	@Override
	public void sell(double amount, int noOfShares) {
		StockAccountImpl accountImpl = new StockAccountImpl();
		Account account = new Account();
		account.credited(amount);
		accountImpl.setNoOfShares(accountImpl.getNoOfShares()+noOfShares);
	}

	@Override
	public void printReport() {
		
	}
}

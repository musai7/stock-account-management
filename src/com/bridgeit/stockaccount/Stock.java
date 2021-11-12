package com.bridgeit.stockaccount;

import java.util.Scanner;

public class Stock {
	private String stockName;
	private int numberOfStocks;
	private double stockPrice;
	private double totalStockValue;

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNumberOfStocks() {
		return numberOfStocks;
	}

	public void setNumberOfStocks(int numberOfStocks) {
		this.numberOfStocks = numberOfStocks;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	
	public double getTotalStockValue() {
		return totalStockValue;
	}

	public void setTotalStockValue(double totalStockValue) {
		this.totalStockValue = totalStockValue;
	}

	@Override
	public String toString() {
		return "Stock [stockName=" + stockName + ", numberOfStocks=" + numberOfStocks + ", stockPrice=" + stockPrice
				+ ", totalStockValue=" + totalStockValue + "]";
	}
}

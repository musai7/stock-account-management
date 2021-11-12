package com.bridgeit.stockaccount;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {

	private List<Stock> stocks;

	public StockPortfolio() {
		stocks = new ArrayList<>();
	}

	public void readFileInput() throws IOException {

		String filePath = "C:\\Users\\musai\\rfp-java\\practice\\shankar rpf-80\\stock-account-management\\stockdata";
		List<String> lines = new ArrayList<String>();
		Path path = Paths.get(filePath);
		lines = Files.readAllLines(path);

		for (String line : lines) {
			
			Stock stock = new Stock();
			String[] words = line.split(" ");
			stock.setStockName(words[0]);
			stock.setNumberOfStocks(Integer.valueOf(words[1]));
			stock.setStockPrice(Double.valueOf(words[2]));
			stock.setTotalStockValue(Integer.valueOf(words[1])*Double.valueOf(words[2]));
			stocks.add(stock);
		}
		System.out.println(stocks);
	}
	
	void totalStockValue() {
		
	}
	
	public static void main(String[] args) throws IOException {
		StockPortfolio portfolio = new StockPortfolio();
		portfolio.readFileInput();
	}
}

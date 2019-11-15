package com.company.patterns.behavioral.command.challenge;

public class StockReceiverUtil {


	public static StockReceiver getTheStock(String stockName, double stockQuantity) {

		if(stockName.equalsIgnoreCase("Bitcoin")) {
			return new BitcoinStockReceiver(stockName, stockQuantity);
		} else {
			return new EtheriumStockReceiver(stockName, stockQuantity);
		}
	}
}

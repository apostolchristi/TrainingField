package com.company.patterns.behavioral.command.challenge;

public class Client {

	public static void main(String[] args) {

		StockReceiver stock = StockReceiverUtil.getTheStock("Bitcoin", 1.2);

		Order buyStocks = new BuyStocks(stock);
		Order sellStocks = new SellStocks(stock);

		Broker broker = new Broker();
		broker.takeOrder(buyStocks);
		broker.takeOrder(sellStocks);
		broker.placeOrders();


	}
}

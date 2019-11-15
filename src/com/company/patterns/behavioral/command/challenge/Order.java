package com.company.patterns.behavioral.command.challenge;

interface Order {

	void execute();
}

class BuyStocks implements Order {

	private StockReceiver stockReceiver;

	public BuyStocks(StockReceiver stockReceiver) {
		this.stockReceiver = stockReceiver;
	}

	@Override
	public void execute() {
		stockReceiver.buy();
	}
}

class SellStocks implements Order {

	private StockReceiver stockReceiver;

	public SellStocks(StockReceiver stockReceiver) {
		this.stockReceiver = stockReceiver;
	}

	@Override
	public void execute() {
		this.stockReceiver.sell();
	}
}

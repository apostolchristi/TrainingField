package com.company.patterns.behavioral.command.challenge;

 interface StockReceiver {

 	void buy();
 	void sell();
}

class BitcoinStockReceiver implements StockReceiver {

 	private String name;
 	private double quantity;

	public BitcoinStockReceiver(String name, double quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	@Override
	public void buy() {
		System.out.println("Buying " +quantity + " of " + name);
	}

	@Override
	public void sell() {
		System.out.println("Selling " +quantity + " of " + name);

	}

	public String getName() {
		return name;
	}

	public double getQuantity() {
		return quantity;
	}
}

class EtheriumStockReceiver implements StockReceiver {

 	private String name;
 	private double quantity;

	public EtheriumStockReceiver(String name, double quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	@Override
	public void buy() {
		System.out.println("Buying " +quantity + " of " + name);
	}

	@Override
	public void sell() {
		System.out.println("Selling " +quantity + " of " + name);
	}

	public String getName() {
		return name;
	}

	public double getQuantity() {
		return quantity;
	}
}





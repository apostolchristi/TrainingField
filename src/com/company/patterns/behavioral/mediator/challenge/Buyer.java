package com.company.patterns.behavioral.mediator.challenge;

abstract class Buyer {

	 AuctionMediator mediator;
	 String name;
	 double price;

	public Buyer(AuctionMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void notification();
	public abstract void bid(double price);
	public abstract void cancelTheBid(double price);


	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

class AuctionBuyer extends Buyer {

	public AuctionBuyer(AuctionMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void notification() {
		System.out.println(this.getName() + "Received message that the auction is over:");
	}

	@Override
	public void bid(double price) {
		this.setPrice(price);
	}

	@Override
	public void cancelTheBid(double price) {
		this.price = 0d;
		System.out.println(this.name + " has canceled his bid!");
	}


}

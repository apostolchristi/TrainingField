package com.company.patterns.behavioral.mediator.challenge;

public class Client {

	public static void main(String[] args) {

		AuctionMediator mediator = new AuctionMediatorImpl();

		Buyer buyer1 = new AuctionBuyer(mediator, "Jason");
		Buyer buyer2 = new AuctionBuyer(mediator, "Jennifer");
		Buyer buyer3 = new AuctionBuyer(mediator, "Lucy");

		mediator.addBuyer(buyer1);
		mediator.addBuyer(buyer2);
		mediator.addBuyer(buyer3);

		buyer1.bid(1800);
		buyer2.bid(2000);
		buyer3.bid(780);

		System.out.println("---------------------------------------");

		mediator.findHighestBid();


	}
}

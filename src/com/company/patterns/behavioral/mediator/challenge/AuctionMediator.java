package com.company.patterns.behavioral.mediator.challenge;

import java.util.ArrayList;
import java.util.List;

interface AuctionMediator {

	void findHighestBid();

	void addBuyer(Buyer buyer);

}

class AuctionMediatorImpl implements AuctionMediator {

	private List<Buyer> buyers;

	public AuctionMediatorImpl() {
		this.buyers = new ArrayList<>();
	}

	@Override
	public void findHighestBid() {
		double maxBid = 0;
		Buyer winner = null;

		for (Buyer b : this.buyers) {
			if (b.getPrice() > maxBid) {
				maxBid = b.getPrice();
				winner = b;
			}
			b.notification();
		}
		System.out.println(" The auction winner is " + winner.getName() + " He paid " + winner.getPrice() + "$ for the item.");
	}

	@Override
	public void addBuyer(Buyer buyer) {
		this.buyers.add(buyer);
		System.out.println(buyer.getName() + " was added to the buyers list");
	}
}

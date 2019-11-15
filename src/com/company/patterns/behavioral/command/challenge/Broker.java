package com.company.patterns.behavioral.command.challenge;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	private List<Order> orders;

	public Broker() {
		this.orders = new ArrayList<>();
	}

	public void takeOrder(Order order) {
		this.orders.add(order);
	}

	public void placeOrders() {
		orders.forEach(Order::execute);

	}
}

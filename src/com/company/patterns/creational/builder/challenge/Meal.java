package com.company.patterns.creational.builder.challenge;

import com.company.patterns.creational.builder.challenge.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> items;

	public Meal() {
		this.items = new ArrayList();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;

		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {
		System.out.println("\n Product completed as below");

		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}

}

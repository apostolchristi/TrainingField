package com.company.patterns.behavioral.strategy.example2;

public class Client {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);

		cart.addItem(item1);
		cart.addItem(item2);

		PaymentStrategy payPal = new PayPalStrategy("test@mail.ru", "12345");
		cart.pay(payPal);

		PaymentStrategy card = new CreditCardStrategy("test name", "45654543434343", "234", "09/21");
		cart.pay(card);


	}
}

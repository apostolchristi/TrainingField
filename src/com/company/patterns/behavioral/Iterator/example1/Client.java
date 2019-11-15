package com.company.patterns.behavioral.Iterator.example1;

public class Client {

	public static void main(String[] args) {

		NotificationCollection notificationCollection = new NotificationCollection();
		NotificationBar notificationBar = new NotificationBar(notificationCollection);
		notificationBar.printNotifications();
	}
}

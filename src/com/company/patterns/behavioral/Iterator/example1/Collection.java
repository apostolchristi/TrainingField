package com.company.patterns.behavioral.Iterator.example1;

//Aggregate
public interface Collection {

	Iterator createIterator();
}

//ConcreteAggregate
class NotificationCollection implements Collection {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	Notification [] notificationsArray;

	public NotificationCollection() {
		notificationsArray = new Notification[MAX_ITEMS];
		addItem("Notification 1");
		addItem("Notification 2");
		addItem("Notification 3");
	}

	public void addItem(String str) {
		Notification notification = new Notification(str);

		if(this.numberOfItems >= MAX_ITEMS) {
			System.err.println("FULL");
		}else {
			this.notificationsArray[this.numberOfItems] = notification;
			this.numberOfItems += 1;
		}
	}

	@Override
	public Iterator createIterator() {
		return new NotificationIterator(this.notificationsArray);
	}
}

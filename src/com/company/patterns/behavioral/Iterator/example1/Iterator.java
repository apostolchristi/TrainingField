package com.company.patterns.behavioral.Iterator.example1;

//Iterator
public interface Iterator {
	// indicates whether there are more elements to iterator over
	boolean hasNext();

	Object next();
}

//ConcreteIterator
class NotificationIterator implements Iterator {

	private Notification[] notificationsArray;

	// maintains curr pos if iterator over the array
	int position = 0;

	// Constructor takes the array of notificationList are going to iterate over
	public NotificationIterator(Notification[] notificationsArray) {
		this.notificationsArray = notificationsArray;
	}

	@Override
	public boolean hasNext() {
		if (this.position >= this.notificationsArray.length || this.notificationsArray[this.position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		// return next element in the array and increment pos
		Notification notification = this.notificationsArray[this.position];
		position += 1;
		return notification;
	}
}

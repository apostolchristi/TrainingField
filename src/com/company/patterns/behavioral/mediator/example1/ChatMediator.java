package com.company.patterns.behavioral.mediator.example1;

import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {

	void sendMessage(String message, User user);

	void addUser(User user);

}

class ChatMediatorImpl implements ChatMediator {

	private List<User> users;

	ChatMediatorImpl() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		for (User u : this.users) {
			// message should not be received by the user sending it
			if (!u.name.equalsIgnoreCase(user.name)) {
				u.receive(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}
}

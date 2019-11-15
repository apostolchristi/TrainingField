package com.company.patterns.behavioral.observer.example1;

public class Client {
	public static void main(String[] args) {
		//create subject
		MyTopic topic = new MyTopic();

		//create observers
		Observer observer1 = new MyTopicSubscriber("observer1");
		Observer observer2 = new MyTopicSubscriber("observer2");
		Observer observer3 = new MyTopicSubscriber("observer3");
		Observer observer4 = new MyTopicSubscriber("observer4");

		topic.register(observer1);
		topic.register(observer2);
		topic.register(observer3);
		topic.register(observer4);

		observer1.setSubject(topic);
		observer2.setSubject(topic);
		observer3.setSubject(topic);
		observer4.setSubject(topic);

		observer1.update();


		topic.postMessage("New message for all");

	}
}

package com.company.patterns.behavioral.chainOfResponsibility.challenge;


//Helper
enum MessagePriority {
	NORMAL, HIGH
}

 class Message {
	private String text;
	private MessagePriority priority;

	 public Message(String msg, MessagePriority priority) {
		 this.text = msg;
		 this.priority = priority;
	 }

	 public String getText() {
		 return text;
	 }

	 public MessagePriority getPriority() {
		 return priority;
	 }
 }

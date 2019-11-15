package com.company.patterns.behavioral.state.challenge;

public class Client {


	public static void main(String[] args) {

		Iphone iphone = new Iphone();
		iphone.alert();
		iphone.alert();
		iphone.changeState(new Silence(iphone));
		iphone.alert();
		iphone.alert();
	}
}

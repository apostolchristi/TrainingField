package com.company.patterns.structural.proxy.challenge;

public class Client {

	public static void main(String[] args) throws Exception {


		Internet realInternet = new ProxyInternet();
		realInternet.connectToNet("mail.ru");

		System.out.println();
		realInternet.connectToNet("fb.com");


	}
}

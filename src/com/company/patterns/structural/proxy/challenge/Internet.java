package com.company.patterns.structural.proxy.challenge;

//Subject
interface Internet {

	void connectToNet(String hostName) throws Exception;
}

class RealInternet implements Internet {


	@Override
	public void connectToNet(String hostName) throws Exception {

		System.out.println("Connecting to " + hostName);

	}
}



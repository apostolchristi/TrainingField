package com.company.patterns.structural.proxy.challenge;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	private RealInternet browser;
	private static List<String> bannedSites;

	static {
		bannedSites = new ArrayList<>();
		bannedSites.add("test.com");
		bannedSites.add("facebook.com");
		bannedSites.add("solo.fo");
	}

	@Override
	public void connectToNet(String hostName) throws Exception {
		if(bannedSites.contains(hostName)) {
			throw new Exception("This website can't be accessed from this host, sorry.");
		}
		if(browser == null) {
			browser = new RealInternet();
		}
		browser.connectToNet(hostName);
	}
}

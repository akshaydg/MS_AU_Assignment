package com.au.unittesting;

public class UserDetails {
	
	String name;
	
	public String canCall(MockerInterface service) {
		if(service.isReceiver()) {
			return "call";
		}
		return "";
	}

}

package com.bridgelabz.ioc;

public class BSNL implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling from BSNL");
	}

	@Override
	public void messaging() {
		System.out.println("Message from BSNL");
	}

	@Override
	public void internetSurfing() {
		System.out.println("Internet Service BSNL");
		
	}

}

package com.bridgelabz.ioc;

public class Vodaphone implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling from Vodaphone");
		
	}

	@Override
	public void messaging() {
		System.out.println("Massage from Vodaphone");
	}

	@Override
	public void internetSurfing() {
		System.out.println("Internet service Vodaphone");
	}

}

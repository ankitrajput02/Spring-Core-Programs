package com.bridgelabz.ioc;

public class Idea implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling from Idea");
		
	}

	@Override
	public void messaging() {
		System.out.println("Message From Idea");
		
	}

	@Override
	public void internetSurfing() {
		System.out.println("Internet Service Idea");
		
	}

}

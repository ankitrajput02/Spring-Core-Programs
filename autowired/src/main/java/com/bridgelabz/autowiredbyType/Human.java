package com.bridgelabz.autowiredbyType;

import com.bridgelabz.autowiredbyType.Heart;

public class Human {
	// bean name and Heart name Are Same in byName
	private Heart heart;// Heart is a of Object Create a Class
	// Default Constructor is Used @Autowired

	// @Autowired
	public void setHeart(Heart heart) {// Setter Method
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("Dead");
		}

	}
}

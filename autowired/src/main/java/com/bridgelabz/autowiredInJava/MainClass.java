package com.bridgelabz.autowiredInJava;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowireInJava.xml");
		Human human = context.getBean("human", Human.class);
		human.startPumping();
		context.close();

	}

}

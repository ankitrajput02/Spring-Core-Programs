package com.bridgelabz.qualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelabz.qualifierAnnotation.Human;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("qualifierAnnotation.xml");
		Human human = context.getBean("human", Human.class);
		human.startPumping();
		((AbstractApplicationContext) context).close();

	}

}

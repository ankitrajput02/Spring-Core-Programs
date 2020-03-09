package com.bridgelabz.injectObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Program to show use of Spring dependency injection or using common object
 * create light weight application
 *
 */
public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Student student = context.getBean("student", Student.class);
		student.reading();
		AnotherStudent anotherStudent = context.getBean("anotherStudent", AnotherStudent.class);
		anotherStudent.startReading();
		((AbstractApplicationContext) context).close();

	}

}

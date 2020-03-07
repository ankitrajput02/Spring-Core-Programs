package com.bridgelabz.dependencySetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Program to show Dependency injection using setter method
 *
 */
public class Classroom {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// ApplicationContext : Central interface to provide configuration for an
		// application.
		/**
		 * ClassPathXmlApplicationContext : Create a new ClassPathXmlApplicationContext,
		 * loading the definitions from the given XML file and automatically refreshing
		 * the context.
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// getBean() : Return an instance, which may be shared or independent, of the
		// specified bean.
		Student ankit = context.getBean("ankit", Student.class);
		ankit.displayStudentInfo();
		Student kunal = context.getBean("kunal", Student.class);
		kunal.displayStudentInfo();

	}

}

package com.bridgelabz.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Title : Program to show Inversion of Control
 *
 */
public class Mobile {

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
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.internetSurfing();
		sim.messaging();
		((AbstractApplicationContext) context).close();

	}

}

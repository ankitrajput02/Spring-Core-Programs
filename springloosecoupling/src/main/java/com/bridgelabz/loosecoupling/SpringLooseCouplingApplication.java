package com.bridgelabz.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLooseCouplingApplication {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student student=context.getBean("student",Student.class);
		student.reading();
		((AbstractApplicationContext) context).close();
}
}

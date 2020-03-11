package com.bridgelabz.valuerequiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("valueRequiredBeans.xml");
		Student student = context.getBean("student", Student.class);
		student.displayStudentInfo();
		((AbstractApplicationContext) context).close();
	}

}

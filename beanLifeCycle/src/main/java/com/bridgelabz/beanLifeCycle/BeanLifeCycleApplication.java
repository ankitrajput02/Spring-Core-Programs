package com.bridgelabz.beanLifeCycle;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);
		studentDAO.selectAllRows();

	}

}

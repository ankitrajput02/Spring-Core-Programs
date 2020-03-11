package com.bridgelabz.beanLifeCycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

	private String driver;
	private String url;
	private String userName;
	private String password;

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void selectAllRows() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, userName, password);
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM user_data");
		while (rs.next()) {
			String firstName = rs.getString(1);
			String lastName = rs.getString(2);
			String email = rs.getString(3);
			long phone = rs.getLong(4);
			String firstPass = rs.getString(5);
			System.out.println(firstName + "\t" + lastName + "\t" + email + "\t" + phone + "\t" + firstPass);
		}
	}
}

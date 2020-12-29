package com.spring.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class mysqltest {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3360/SpringBoot?useSSL=false&serverTimezone=UTC";
	private static final String USER = "KimJiHu0";
	private static final String PW = "jihu0000";

	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);

		try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("Success");
			System.out.println(con);
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

}

package com.mysql.spring;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
// 
public class MySQL {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3333/Spring?useSSL=false&serverTimezone=UTC"; 
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

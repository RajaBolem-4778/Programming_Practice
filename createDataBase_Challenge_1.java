package com.skilllync.Programming_workshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class createDataBase_Challenge_1 {
	private static String url = "jdbc:mysql://localhost:3306/jdbc_training";
	private static String user = "root";
	private static String pwd = "root";
	private static Connection con;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection(url, user, pwd);

			String sql = "Create DataBase Challenge_1";
			con.createStatement();

			PreparedStatement preparedStmt = con.prepareStatement(sql);
			preparedStmt.executeUpdate(sql);
			System.out.println("Query Executed");
			preparedStmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Connectivity failed");
		}
	}
}

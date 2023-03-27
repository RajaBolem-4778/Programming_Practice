package com.skilllync.Programming_workshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CreateTable_Ecommerce{
	private static String url = "jdbc:mysql://localhost:3306/jdbc_training";
	private static String user = "root";
	private static String pwd = "root";
	private static Connection con;
	private static Statement stmt;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection(url, user, pwd);

			System.out.println("Connection Established ");
			String sql = "Create table Ecommerce(Product_id int, Product_name varchar(100), Product_cost int, Product_available_quantity int, Product_rating int, Product_owner varchar(100)";
			stmt = con.createStatement();

			stmt.executeUpdate(sql);
			System.out.println("Query Executed");

			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Connectivity failed");
		}
	}
}

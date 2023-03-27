package com.skilllync.Programming_workshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataBase_Challenge_5 {
	private static String url = "jdbc:mysql://localhost:3306/jdbc_training";
	private static String user = "root";
	private static String pwd = "root";
	private static Connection con;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection(url, user, pwd);

			String sql = "INSERT INTO Ecommerce(Product_id, Product_name, Product_cost, Product_available_quantity, Product_rating, Product_owner) VALUES (?, ?, ?, ?, ?, ?)";

			PreparedStatement preparedStmt = con.prepareStatement(sql);

			preparedStmt.executeUpdate("INSERT INTO Ecommerce" + " Values(1,'Soap',20,100,4,'Santoor')");
			preparedStmt.executeUpdate("INSERT INTO Ecommerce" + " Values(2,'Chair',2000,140,5,'Godrej')");
			preparedStmt.executeUpdate("INSERT INTO Ecommerce" + " Values(3,'Sofa',12000,10,4,'Godrej')");
			preparedStmt.executeUpdate("INSERT INTO Ecommerce" + " Values(4,'Pen',10,500,4,'Santoor')");
			preparedStmt.executeUpdate("INSERT INTO Ecommerce" + " Values(5,'Pencil',10,100,4,'Nataraj')");
			preparedStmt.executeUpdate("INSERT INTO Ecommerce" + " Values(6,'Book',20,300,4,'Sneha')");
			preparedStmt.executeUpdate("INSERT INTO Ecommerce" + " Values(7,'Laptop',62000,8,4,'Apple')");
			preparedStmt.executeUpdate("INSERT INTO Ecommerce" + " Values(8,'Mobile',24200,35,4,'OnePlus')");
			System.out.println("Query Executed");

			String sql_1 = "Select * from Ecommerce where Product_cost > 2000";
			ResultSet result = preparedStmt.executeQuery(sql_1);
			while (result.next()) {
				System.out.println("ProductName : " + result.getString(1)); // where 1 is index value
			}
			preparedStmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Connectivity failed");
		}
	}

}

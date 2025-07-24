package com.Student;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con;
	
	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/Student?autoReconnect=true&useSSL=true";
			String username = "root";
			String password = "root";
			
			con = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
		
	}
}

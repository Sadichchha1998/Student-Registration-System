package com.masai.util;

import java.sql.Connection;
import java.sql.DriverManager;
// Here Provide the connection between the my.sql table and jar file
// by using provide connection method.



public class DBUtil {
	public static Connection ProvideConnection() {
		
			Connection conn = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			}
			// Here given path of database
			String url="jdbc:mysql://localhost:3306/pro";
			
			try {
				// Here connect DriverManeger to get connection method
				// root is user_name , "2580" is password
				
			 	conn= DriverManager.getConnection(url,"root","2580");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			// return type is connection.
			return conn;
		}
}

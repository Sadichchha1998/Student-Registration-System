package com.masai.util;

import java.sql.Connection;

public class DbConnectiom {
	public static void main(String[] args) {
		Connection conn=DBUtil.ProvideConnection();
		if(conn!=null) System.out.println("Data Base  Conected...");
		else System.out.println("Data Base Not Conected...");

	}
}

package com.ibm.emp;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDemo {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306";
		Connection conn = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "pass@word1");
			System.out.println("Connection successful");
			
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB Name: " + meta.getDatabaseProductName());
			System.out.println("DB Ver: " + meta.getDatabaseProductVersion());
			System.out.println("Driver Name: " + meta.getDriverName());
			System.out.println("Driver Ver: " + meta.getDriverVersion());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
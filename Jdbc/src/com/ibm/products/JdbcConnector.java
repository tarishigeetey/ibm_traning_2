package com.ibm.products;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


import com.mysql.cj.jdbc.Driver;

public class JdbcConnector {
	private JdbcConnector() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() throws SQLException {
		String url ="jdbc:mysql://localhost:3306/db";
		Connection conn = null;
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		conn = DriverManager.getConnection(url, "root", "pass@word1");
		return conn;
	}
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, "root", "pass@word1");
			System.out.println("Connection Successful!!");
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println(meta.getDatabaseProductName());
			System.out.println(meta.getDatabaseProductVersion());
			System.out.println(meta.getDriverName());
			System.out.println(meta.getDriverVersion());
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				if(conn != null)
					conn.close();
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
	}
}

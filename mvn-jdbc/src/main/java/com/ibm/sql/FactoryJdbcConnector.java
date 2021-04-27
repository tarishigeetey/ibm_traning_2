package com.ibm.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



import com.mysql.cj.jdbc.Driver;

public final class FactoryJdbcConnector {
	
	public FactoryJdbcConnector() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() throws SQLException {
		String url ="jdbc:mysql://localhost:3306";
		Connection conn = null;
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		conn = DriverManager.getConnection(url, "root", "pass@word1");
		return conn;
	}
}

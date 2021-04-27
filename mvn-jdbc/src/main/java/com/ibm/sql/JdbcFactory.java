package com.ibm.sql;


import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class JdbcFactory {

	private JdbcFactory() {
		
	}
	public static Connection getConnection() throws SQLException{
		Properties p = new Properties();
		
		try {
			p.load(new FileReader("src/main/resources/dbinfo.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new SQLException(e);
		}
		
		try {
			Class.forName(p.getProperty("driver"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new SQLException(e);
		}
		
		return DriverManager.getConnection(p.getProperty("url"),
				p.getProperty("user"), p.getProperty("pass"));
	}
}
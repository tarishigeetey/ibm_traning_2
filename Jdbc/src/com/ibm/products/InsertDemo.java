package com.ibm.products;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertDemo {
		public static void main(String[] args) {
			String sql = "insert into pd values (113,'Apples',300)";
			Connection conn = null;

			try {
				conn = JdbcConnector.getConnection();
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				System.out.println("Record inserted");
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

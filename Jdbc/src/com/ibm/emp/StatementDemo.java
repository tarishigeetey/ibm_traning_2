package com.ibm.emp;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) {
		String sql = "insert into employee values (113,'jiraya',2500)";
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
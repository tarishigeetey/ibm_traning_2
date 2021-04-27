package com.ibm.products;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		Connection conn = null;
		
		String sql1 = "insert into pd values (112, 'Gum', 500)";
		String sql2 = "update pd set price=200 where price=300";
		String sql3 = "delete from pd where price=1000";
		
		try {
			conn = JdbcConnector.getConnection();
			conn.setAutoCommit(false);
			
			Statement stmt = conn.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			conn.commit();
			System.out.println("Transaction complete");
		} catch (SQLException e) {
			System.out.println("Transaction failed!!");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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

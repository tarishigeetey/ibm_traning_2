package com.ibm.sql;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.junit.Test;

public class TestFactory {

	@Test
	public void testConnections() throws SQLException{
		assertNotNull(JdbcFactory.getConnection());
	}
	
	
}

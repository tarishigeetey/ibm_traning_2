

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestSubscription {
	private Subscription sub;
	
	@BeforeEach
	public  void init() {
		sub = new Subscription();
	}
	
	@Test
	public void testMonthly() {
		assertEquals(100, sub.monthly());
	}
	
	@Test
	public void testQuaterly() {
		assertEquals(250, sub.quaterly());
	}
	
	@Test
	public void testAnually() {
		assertEquals(1000, sub.anually());
	}
	
	

}

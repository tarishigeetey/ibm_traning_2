
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPizza {
	
	private Pizza pz;
	
	@BeforeEach
	public void setup() {
		pz = new Pizza();
	}
	
	@Test
	public void testTopping() throws PizzaOrderInvalidException{
		assertEquals(200, pz.order("S", 2));
	}
	
	@Test
	public void testSize() throws PizzaOrderInvalidException {
		assertEquals(400, pz.order("M", 2));
	}
	
	@Test
	public void testSizeInvalid() {
		assertThrows(PizzaOrderInvalidException.class,() -> pz.order("Z", 3));
	}
	
	@Test
	public void testToppingsInvalid() {
		assertThrows(PizzaOrderInvalidException.class,() -> pz.order("M", 6));
	}
	
	
	
}


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccount {
	
	private Account acnt;
	
	@BeforeEach
	public void init() {
		acnt = new Account(1000);
	}
	
	@Test
	public void testDeposite() {
		assertEquals(200, acnt.deposite(200));
	}
	
	@Test
	public void testWithdraw() throws BalanceException{
		assertEquals(500, acnt.withdraw(500));
	}
	
	
	@Test
	public void testNegativeDeposite() throws BalanceException {
		assertThrows(NumberFormatException.class, () -> acnt.deposite(-100));
		
	}
	
	@Test
	public void testNegativeWithdraw() throws BalanceException {
		assertThrows(NumberFormatException.class, () -> acnt.withdraw(-200));
		
		
	}
	
	@Test
	public void testInvalidWithdraw()  {
		assertThrows(BalanceException.class, () -> acnt.withdraw(1500));
	    
	}
	

}

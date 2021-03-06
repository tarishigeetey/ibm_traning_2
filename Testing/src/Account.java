
public class Account {
	
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(double balance) {
		this.balance = balance;
	}
	
	public double deposite(double amount) throws NumberFormatException {
		if(amount < 0)
			throw new NumberFormatException("Negative amount");
	
		balance+=amount;
		return balance;
		
	}
	
	public double withdraw(double amount) throws BalanceException , NumberFormatException{
	
		if(amount <0)
			throw new NumberFormatException("Negative Amount");
	
		if(amount>balance)
			throw new BalanceException("Insufficient balance");
	
		balance -=amount;
		return amount;
	}
}

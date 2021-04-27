package com.ibm.banking;
public class TestAccount {

	public static void main(String[] args) {
		
//		Transaction txn = new Transaction("DR", 200, 5000);
//		txn.print();

		Banking  s = Adapter.openSavingsAccount("Polo");
		Banking c = Adapter.openCurrentAccount("Polo");

		try {
			s.withdraw(2000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace(); // For debugging/troubleshooting - user: Decelopers
            System.out.println(e); // For system/application audit - User: Logger
		    //System.out.println(e.getMessage()); // For end user
		}
//		s.deposite(2000);
//		s.statement();
//		
//		c.deposite(5000);
//		try {
//			c.withdraw(1000);
//		} catch (BalanceException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		c.deposite(2000);
//		c.summary();


//		Savings  sv = new Savings("Mona");
//		sv.deposite(3000);
//		sv.withdraw(2000);
//		sv.deposite(4000);
//		sv.statement();

	}

}

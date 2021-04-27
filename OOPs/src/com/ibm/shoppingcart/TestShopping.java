package com.ibm.shoppingcart;
// One to Many 
public class TestShopping {

	public static void main(String[] args) {
		ShoppingCart s = new ShoppingCart();
		
		Payment p = new Payment();
		p.setBalance(10000);
		p.setCardNo("1001223144153");
		s.addProduct(new Product("iPhone 12 Mini", 2000));
		s.addProduct(new Product("Potato", 50));
		
		try {
			s.checkout(p, "HOLI200");
		} catch (OutofStockException e) {
			e.printStackTrace();
		}
		System.out.println(p.getBalance());
		

	}

}

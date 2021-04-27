package com.ibm.shoppingcart;
//One to Many - Unidirectional
public class ShoppingCart extends Product {
	private Product[] items;
	private double cartTotal;
	private int idx;
	
	String[][] coupons = {{"HOLI200", "200"}, {"WKND100", "100"}, {"APRIL150", "150"}};


	public ShoppingCart() {
		items = new Product[5]; 
		
	}
	
	public void addProduct(Product p) {
		if(idx < items.length) {
			items[idx++] = p;
			cartTotal += p.getPrice();
			
		}else
			System.out.println("Your Cart is Full!");
	}
	
	public void checkout(Payment p, String code) throws OutofStockException {
		if(idx == 0 )
			System.out.println("Cart is empty!!");
		else if(idx != 0 && p.getBalance() >= cartTotal){
			if(code != null && cartTotal > 2000){
				for(int i = 0; i< coupons.length; i++){
					if(code.equals(coupons[i][0]))
						cartTotal -= Integer.parseInt(coupons[i][1]);
					}
		for(int i = 0; i< idx; i++) {
			
			System.out.println(items[i].getName()+ " " + items[i].getPrice());
		}
		p.setBalance(p.getBalance() - cartTotal);
		}
			

		System.out.println("Cart Total: " + cartTotal);
		}
		else
			throw new OutofStockException("Payment Fail!!");
		
	}

}

import java.util.HashMap;

public class Pizza {
	
	private String size;
	private int toppings;
	private HashMap<String, Integer> h = new HashMap<String, Integer>();
	public Pizza() {
		// TODO Auto-generated constructor stub
		h.put("S" , 100);
		h.put("M" , 200);
		h.put("L" , 300);
	}
	
	public double order(String size, int topping) throws PizzaOrderInvalidException {
		double price = 0;
		if(size == "S" || size == "M" || size == "L") {
			
			if(topping >=2 && topping <= 5) {
				price = h.get(size) * topping * 50;
			}else
				throw new PizzaOrderInvalidException("Invalid Topping Order");
		}else 
			throw new PizzaOrderInvalidException("Invalid Size Order");
	   return 0;
	}
}

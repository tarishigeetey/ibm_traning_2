
public class Car {
	private String model;
	private String[] features;
	
	public Car(String model, String...features) { // Only last param in method/constructor // VarArgs
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of " + model);
		for(String f: features)
			System.out.println(" > " + f);
	}
	
	public static void main(String[] args) {
		//String[] falto = {"Keyless", "Power Steering", "AC"};
		
		Car alto = new Car("Suzuki Alto","Keyless", "Power Steering", "AC");
		
		//String[] fhector = {"ABS", "Moon Roof", "Climate Control", "Cruise", "Air Bags","Keyless Start"};		
		Car hector = new Car("MG Hector", "ABS", "Moon Roof", "Climate Control", "Cruise", "Air Bags","Keyless Start");
		
		alto.specs();
		hector.specs();
	}

}

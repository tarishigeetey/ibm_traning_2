// Generic 
public class NewDemo<Z> {
	private Z data;
	
	public NewDemo(Z data) {
		this.data = data;
	}
	
	public Z getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		NewDemo<String> d1 = new NewDemo<String>("Hello");
		//d1.setData(111);   No Change in Character is allowed
		System.out.println(d1.getData());
		
		NewDemo<Integer> d2 = new NewDemo<Integer>(1000);
		System.out.println(d2.getData());
		
		NewDemo<Integer> d3 = new NewDemo<Integer>(1000);
		System.out.println(d3.getData() + d2.getData());
	}
	

}

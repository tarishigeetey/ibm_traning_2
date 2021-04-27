
public class ChildDemo<Z, A> extends NewDemo<Z> {
	private A temp;

	public ChildDemo(Z data, A temp) {
		super(data);
		this.temp = temp;
		// TODO Auto-generated constructor stub
	}

	public A getTemp() {
		return temp;
	}

	public void setTemp(A temp) {
		this.temp = temp;
	}
	
	public static void main(String[] args) {
		
		ChildDemo<String, Integer> cd1 = new ChildDemo<String, Integer>("Apple", 200);
		System.out.println(cd1.getData() + cd1.getTemp());
		
		
		
		
		
	}
	

}


public class Demo {
	private Object data;
	
	public Demo(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Demo d = new Demo("Hello");
		d.setData(12.45);    // Charater Change
		System.out.println(d.getData());
	}
}

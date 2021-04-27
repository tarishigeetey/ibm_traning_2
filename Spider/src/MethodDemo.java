@FunctionalInterface
interface Method{
	int max(int a, int b);
}

public class MethodDemo {
	
	public static void main(String[] args) {
		
		Method m1 = (x, y) -> {
			if(x>y)
				return x;
			else
				return y;
		};
		
		System.out.println(m1.max(10, 20));
		
		Method m2 = (x, y) -> x>y?x:y ;
		System.out.println(m2.max(100,  500));
	}

}

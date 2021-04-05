
public class AssertDemo1 {
	public static void main(String[] args) {
		int age = 10;
		assert age >= 18: "Not Valid"; // in a code but does not affect
		System.out.println("Age is: " + age);
	}
}

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;


public class PersonRefection {
	public static void main(String[] args) throws ClassNotFoundException {
//		Person p = new Person("Polo", 21);
//		
//		Class pc = p.getClass();
		
		Class pc = Class.forName("Person"); // It loads a Java Class manually into memory
		System.out.println(pc.getName());
		
		
		
		Constructor[] cn= pc.getConstructors();
		System.out.println("Constructors --------");
		for(Constructor c: cn) {
			System.out.println(c);
		}
		
		Method[] methods = pc.getMethods();
		System.out.println("Methods --------");
		for(Method m : methods)
			System.out.println(m);
		System.out.println("Declared Methods --------");
		Method[] de = pc.getDeclaredMethods();
		for(Method m : de)
			System.out.println(m);
		
		Field[] f= pc.getDeclaredFields();
		System.out.println("Fields --------");
		for(Field c: f) {
			System.out.println(c);
		}
		
		
		
	};

}

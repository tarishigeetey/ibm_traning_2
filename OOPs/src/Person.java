
public class Person {
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
		this("Anonymous", -1);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.println("Name: " + name + "\tAge: " + age);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + " Age: " + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person  p = (Person) obj;
			if(p.name.equals(this.name) && p.age == this.age)
				return true;
		}
		return false;
	}
	
	

	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Person no more!");
		
	}
	public static void main(String[] agrs) {
		
		Person p = null;
		
		for(int c=1; c<=5; c++) {
			p = new Person();
		}
		System.gc();         //Requesting GC 
		
//		Person p1 = new Person("Polo", 21);
//		System.out.println(p1.hashCode());
//		System.out.println(p1);
//		Person p2 = new Person();
//		System.out.println(p1.equals(p2));
		

		
	}
	
}

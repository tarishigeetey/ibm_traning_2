
import java.util.Hashtable;
import java.util.Vector;

public class PersonCollection {
	
	public static int autogen = 1;
	public static void main(String[] args) {
		Vector<Person> person = new Vector<Person>();
		
		person.add(new Person("Polo", 21));
		person.add(new Person("Lilli" , 19));
		person.add(new Person("Milli", 17));
		
		for(Person p: person)
			System.out.println(p);
		
		Hashtable<Integer, Person> persons = new Hashtable<Integer, Person>();
		
		persons.put(autogen++,new Person("Polo", 21));
		persons.put(autogen++, new Person("Lilli" , 19));
		persons.put(autogen++, new Person("Milli", 17));
		
		
	}
	
}



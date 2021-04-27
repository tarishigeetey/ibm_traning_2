import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
	
	public static void main(String[] args) {
		
		PersonAgeComperator pac = new PersonAgeComperator();
		
		Comparator<Person> pnc = (p1, p2) -> p1.getName().compareTo(p2.getName());
		
		
		TreeSet<Person> person1 = new TreeSet<Person>(pac);
		
 		person1.add(new Person("Polo", 20));
		person1.add(new Person("Lilli" , 19));
		person1.add(new Person("Milli", 17));
		
		
		for(Person p : person1)
			System.out.println(p);

	}

}
class  PersonAgeComperator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.getAge() - p2.getAge();
	}
}


	
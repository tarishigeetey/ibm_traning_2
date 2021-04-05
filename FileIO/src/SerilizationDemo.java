import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizationDemo {
	public static void main(String[] args) throws Exception {
		Person p = new Person("Stephen", 21);
		System.out.println(p);
		
		String path = "src/pers.dat";
		ObjectInputStream istream = null;
		ObjectOutputStream ostream = null;
		
		//Serelization code
		ostream = new ObjectOutputStream(new FileOutputStream(path));
		ostream.writeObject(p);  //serilize object
		ostream.close();
		System.out.println("Object serelized...");
		
		//Deserilization code
		
		istream = new ObjectInputStream(new FileInputStream(path));
		Object obj = istream.readObject(); //Deserilization object
		System.out.println(obj);
		istream.close();
		
	}

}
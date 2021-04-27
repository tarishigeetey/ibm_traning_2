import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = console.next();
		
		// Patterns
		String namePattern = "[A-Z][a-z]{3,}";
				
		System.out.println("Your name is: " + (name.matches(namePattern)?"Valid":"Invalid"));
		
		System.out.print("Enter mobile no. ");
		String mobile = console.next();
		String mobilePattern = "[7-9][0-9]{9}";
		System.out.println("Your mobile no. is: " + (mobile.matches(mobilePattern)?"Valid":"Invalid"));
		
		
		System.out.print("Enter Age: ");
		String age =  console.next();
		String agePattern = "[0-9]{2}";
		System.out.println("Your age is: " + (age.matches(agePattern)?"Valid":"Invalid"));
		console.close();
		

	}

}

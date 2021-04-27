package com.ibm.emp;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager ep1= new Manager("Polo", 9000, 3000);
		System.out.println(ep1.getSalary());
		
		Executive ep2 = new Executive("Lilli", 7000, 2000);
		System.out.println(ep2.getSalary());
		
		Employee emp = ep1;
		System.out.println("Salary: "+ emp.getSalary());
		
		showSalary(ep1);
		showSalary(ep2);

	}
	
	// Polymorphic method
	
	public static void showSalary(Employee emp) {
		if(emp instanceof Manager) //Runtime Type Identification
			System.out.println("Manager Salary: " + emp.getSalary());
		else
			System.out.println("Executive Salary: " + emp.getSalary());
	}

	//Method Overloading
	
//	private static void showSalary(Executive ep2) {
//		System.out.println("Executive Salary: "+ ep2.getSalary());
//		
//	}
//
//	private static void showSalary(Manager ep1) {
//		System.out.println("Manager Salary: " + ep1.getSalary());
//		
//	}

}

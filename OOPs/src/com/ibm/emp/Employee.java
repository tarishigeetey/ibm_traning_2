package com.ibm.emp;

public class Employee { // Generalize Class
	private int empId;
	private String empName;
	private double salary;
	
private static int autogen;
	
	static {// Static initilizer block, it executes at the time of class loadings
		autogen = 1001;
	}
	
	
	public Employee() {
		//this(001, "Anonymous", 0.00);
	}
	
	public Employee(String empName, double salary) {
		this.empId = autogen++;
		this.empName = empName;
		this.salary = salary;
	}
	
	
	public void payslip() {
		System.out.println("EmployeId: " + empId + " Name: " + empName + " Salary: " + salary);
		
	}

	public double getSalary() {
		return salary;
	}
	

}

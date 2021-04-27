package com.ibm.emp;

public class Executive extends Employee{  // Specilized Class
	private double comission;

	public Executive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Executive(String empName, double salary, double comission) {
		super(empName, salary);
		this.comission = comission;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Comission: " + comission);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+comission;
	}
	

}

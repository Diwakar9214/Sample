package org.Constructor;

public class Employee {
	//Parameterized Constructor
	String employeename;
	int employeeId;
	
	public Employee(String employeename,int employeeId )
	{
		this.employeename=employeename;
		this.employeeId=employeeId;
		
	}
	public static void main(String[] args) {
		Employee emp=new Employee("Hari",192);
		System.out.println("Employee Name: "+emp.employeename);
		System.out.println("Employee ID: "+emp.employeeId);
	}
}

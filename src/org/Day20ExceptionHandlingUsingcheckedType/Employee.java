package org.Day20ExceptionHandlingUsingcheckedType;

public class Employee {
	public static void main(String[] args)throws EmployeeNotFoundException {
		
		String id="1234";
		
		if(id.startsWith("100"))
		{
		System.out.println("Valid Employee");	
		}
		else
		{
			throw new EmployeeNotFoundException();
		}
	}

}

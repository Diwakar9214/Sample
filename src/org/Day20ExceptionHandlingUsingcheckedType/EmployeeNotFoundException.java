package org.Day20ExceptionHandlingUsingcheckedType;

public class EmployeeNotFoundException extends Exception {
	
	@Override
	public String getMessage() {
		String msg="Employee not Vaild";
		return msg;
	}
	
}

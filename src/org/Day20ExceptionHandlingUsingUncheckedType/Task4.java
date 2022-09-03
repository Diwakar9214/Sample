package org.Day20ExceptionHandlingUsingUncheckedType;

public class Task4 {
	public static void main(String[] args) {
		try {
			System.out.println("1");
			int data=5/0;
			
			
		} catch (ArithmeticException e) {
			Throwable obj=new Throwable();
		
		
		
		try {
			throw obj;
		} catch (Throwable e1) {
			System.out.println("8");
		}
		}
		finally {
			System.out.println("3");
		}
		System.out.println("4");
	}
}

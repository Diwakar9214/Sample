package org.Day20ExceptionHandlingUsingUncheckedType;

public class NestedTry {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			//Arithmetic exception occurs so outer catch block
			System.out.println(4/0);
			try {
				
				String s=null;
				System.out.println(s.charAt(2));
				
			} catch (NullPointerException e) {
				System.out.println("String is null value");
			}
			finally {
				System.out.println("Inner finally");
			}
			
		} 
		catch (ArithmeticException e) {
			System.out.println("Dont Divide number by 0");
		}
		finally
		{
			System.out.println("Outer Finally");
		}
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);	
	}

}

package org.Day20ExceptionHandlingUsingUncheckedType;

import java.util.InputMismatchException;

public class NestedTryPrintstackTrace {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			
			System.out.println(4/0);
			try {
				//Nullpointer exception occurs so inner catch block
				String s=null;
				System.out.println(s.charAt(2));
				} catch (InputMismatchException e) {
				System.out.println("Mis Match in the given input");
			}
			finally {
				System.out.println("Inner finally");
			}			
		} 
		catch (Exception e) {
			e.printStackTrace();
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

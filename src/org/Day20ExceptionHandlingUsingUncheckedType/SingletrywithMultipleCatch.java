package org.Day20ExceptionHandlingUsingUncheckedType;

import java.util.InputMismatchException;

public class SingletrywithMultipleCatch {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			//only first exception will execute 12line
			System.out.println(4/0);
			
			String s=null;
			System.out.println(s.charAt(2));
			
		} catch (ArithmeticException e) {
			System.out.println("Dont Divide number by 0");
		}
		catch (NullPointerException e) {
			System.out.println("Given string is null value");
		}
		catch (InputMismatchException e) {
			System.out.println("Mis match in given input");
		}
		finally {
			System.out.println("Success..!");
		}
		
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
	}
}

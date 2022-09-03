package org.Day20ExceptionHandlingUsingcheckedType;

import java.awt.AWTException;
import java.io.IOException;
import java.util.InputMismatchException;

public class ThrowsandThrowHandling {
	
	public static void main(String[] args)throws IOException,
	AWTException,InputMismatchException {
		int a=20;
		int b=a+4;
		if(b<25)
		{
			throw new ArithmeticException();
			
		}
		else
		{
			System.out.println("Sum is greater than 25");
		}
	}

}

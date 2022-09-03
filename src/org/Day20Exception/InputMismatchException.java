package org.Day20Exception;

import java.util.Scanner;

public class InputMismatchException {
	public static void main(String[] args) {
		//InputMis match Exception 
		Scanner s=new Scanner(System.in);
		byte nextByte = s.nextByte();
		System.out.println(nextByte);	
		}
}

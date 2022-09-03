package org.Day20Exception;

public class NumberFormatexception {
	public static void main(String[] args) {
		
		
		String s="1234";
		
		//concat the 2 string
		System.out.println(s+10);
		// adding 2 number
		//convert string to number
		int a = Integer.parseInt(s);
		System.out.println(a+10);
		
		//Number Format Exception
		String s1="45RTG12";
		int parseInt = Integer.parseInt(s1);
		//Since String s1 is aplha numeric
		//convertion is not possible
		
		System.out.println(parseInt);
	}

}

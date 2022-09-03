package org.Day13;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("Year is started");
		for(int a=0;a<=12;a++)
		{
			if(a==5)
			{
				System.out.println("Current month is may");
				break;
			}
			System.out.println("Not Current month");
		}
		System.out.println("Year is ended");
	}

}

package org.Day13;

public class Calendar1 {
	public static void main(String[] args) {
		System.out.println("Year started");
		for(int i=0;i<=12;i++)
		{
			if(i==5)
			{
				
				continue;
			}
			System.out.println("Not current month"+i);
		}
		System.out.println("Year ended");
	}
}

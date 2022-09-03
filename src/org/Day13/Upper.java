package org.Day13;

public class Upper {

	public static void main(String[] args) {
		String s="WelComeToJava";
		int upper=0,lower=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			boolean b=Character.isUpperCase(c);
			boolean b1=Character.isLowerCase(c);
			if(b==true)
			{
			upper++;
			}
			 if(b1==true)
			 {
				 lower++;
			 }
			
		}System.out.println("Uppercase is"+upper);
	System.out.println("Lower is"+lower);
	
		
	}
}

package org.Day13;

public class Vowel {

	public static void main(String[] args) {
		String s="Nisha";
		int vowel=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
			vowel++;
			}
			
		}System.out.println(vowel);
		
	}
}

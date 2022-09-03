package org.Day13;
public class Sample {
	public static void main(String[] args) {
		int a =0;
		
		while(a<10)
		{
			System.out.println(a);
			a++;
		}
		System.out.println("******************");
		int b=100;
		while(b<10)
		{
			System.out.println(b);
		}
		int c=0;
		//Since it is not loop, only c initial value is printed
		if(c<10)
		{
			System.out.println(c);
			c++;
		}
		//Infinite loop
		int d=0;
		while(d<10)
		{
			System.out.println(d);
		}
		for(;;)
		{
			System.out.println("Hello");
		}
		
	}

}

package org.Scanner;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter user Name, age and Salary");
		String Name = s.nextLine();
		int Age = s.nextInt();
		double Salary = s.nextDouble();
		System.out.println("User Name: "+Name);
		System.out.println("User Age: "+Age);
		System.out.println("User Salary: "+Salary);
		
		
		
	}
}

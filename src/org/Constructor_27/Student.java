package org.Constructor_27;

import org.Constructor.Students;
	
	public class Student
	{
		//default or non parameterized constructor
		public Student()
		{
			System.out.println("Default constructor");
		}
		//Parameterized constructor
		public Student(int x)
		{
			System.out.println("int para constructor");
		}
		//method
		public void Student()
		{
			System.out.println("Method");
		}
		public static void main(String[] args) {
			Student s=new Student();
			Student s1=new Student(100);
		}
	}
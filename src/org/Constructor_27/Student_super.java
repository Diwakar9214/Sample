package org.Constructor_27;

public class Student_super extends Hello {
	
	public  Student_super()
	{
		super(300);
		System.out.println("Default Constructor");
		
	}
	public  Student_super(int id)
	{
		super(300);
		System.out.println("int para Constructor");
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		Student_super s=new Student_super();
		Student_super s1=new Student_super(100);
		
	}
}

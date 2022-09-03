package org.Constructor_27;



public class Studen_this {
	public Studen_this()
	{
		this(200);
		System.out.println("Default Constructor");
	}
	public Studen_this(int id)
	{
		this("Nisha",7892323456l);
	}
	public Studen_this(String name, long phone)
	{
		System.out.println("String long para constructor");
		System.out.println(name);
		System.out.println(phone);
	}
	public static void main(String[] args) {
		Studen_this s=new Studen_this();
	}

}

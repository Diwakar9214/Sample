package org.SingleTonClass;

public class Student {
	static Student stu;
	private Student()
	{
		//To restrict object creation in another class
	}
	public static Student add()
	{
		if(stu==null)
		{
			stu=new Student();
			
		}
		return stu;
	}
	public static void main(String[] args) {
		Student s=add();
		System.out.println(s);
		Student s1=add();
		System.out.println(s1);
		Student s2=add();
		System.out.println(s2);
		
	}

}

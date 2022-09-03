package org.Constructor;

public class Employ {
	//Constructor overloading
		String employeename;
		int employeeId;
		
		public Employ()
		{
			System.out.println("Calling constructor");
		}
		public Employ(String employeename,int employeeId )
		{	
			this.employeename=employeename;
			this.employeeId=employeeId;
			
		}
		public Employ(int employeeId,String employeename )
		{
			this.employeename=employeename;
			this.employeeId=employeeId;
			
		}
		public static void main(String[] args) {
			new Employ();
			Employ emp=new Employ("Hari",192);
			System.out.println("Employee Name: "+emp.employeename);
			System.out.println("Employee ID: "+emp.employeeId);
			Employ emp1=new Employ(102,"Danny");
			System.out.println("Employee Name: "+emp1.employeename);
			System.out.println("Employee ID: "+emp1.employeeId);
		}
}

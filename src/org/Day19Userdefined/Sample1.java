package org.Day19Userdefined;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample1 {
	public static void main(String[] args) {
		Employee e1=new Employee(10,"Nisha",9819987889l);
		Employee e2=new Employee(20,"Vel",98199127889l);
		Employee e3=new Employee(30,"Venkat",9842987889l);
		Set<Employee>s=new HashSet<>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		for (Employee emp : s) {
			System.out.println("Id is "+emp.getId());
			System.out.println("Name is "+emp.getName());
			System.out.println("Phone is "+emp.getPhone());
		
		}
	}

}

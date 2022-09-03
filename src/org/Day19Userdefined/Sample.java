package org.Day19Userdefined;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		Employee e1=new Employee(10,"Nisha",9819987889l);
		Employee e2=new Employee(20,"Vel",98199127889l);
		Employee e3=new Employee(30,"Venkat",9842987889l);
		List<Employee>li=new ArrayList<>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		Employee em= li.get(1);
		System.out.println(em);
		
		System.out.println("Id is "+em.getId());
		System.out.println("Name is "+em.getName());
		System.out.println("Phone is "+em.getPhone());
		
		
		for (int i = 0; i < li.size(); i++) {
			Employee emp = li.get(i);
			System.out.println("Id is "+emp.getId());
			System.out.println("Name is "+emp.getName());
			System.out.println("Phone is "+emp.getPhone());
		}
	}

}

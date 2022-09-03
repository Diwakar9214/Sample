package org.Day19Userdefined;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample2 {
	public static void main(String[] args) {
		Employee e1=new Employee(10,"Nisha",9819987889l);
		Employee e2=new Employee(20,"Vel",98199127889l);
		Employee e3=new Employee(30,"Venkat",9842987889l);
		Map<Integer,Employee>s=new LinkedHashMap<>();
		s.put(1,e1);
		s.put(2,e2);
		s.put(3,e3);
		
		Set<Entry<Integer, Employee>> entrySet = s.entrySet();
		for (Entry<Integer, Employee> emp : entrySet) {
			System.out.println("key is "+emp.getKey());
			Employee em=emp.getValue();
			System.out.println("Id is"+em.getId()+"Name is"+em.getName()+"Phone is"+em.getPhone());
		}
		
	}

}

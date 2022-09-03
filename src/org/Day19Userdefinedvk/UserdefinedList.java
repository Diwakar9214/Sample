package org.Day19Userdefinedvk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserdefinedList {
	public static void main(String[] args) {
		
	
	Sample s=new Sample();
	s.setId(100);
	s.setName("Arun");
	

	Sample s1=new Sample();
	s1.setId(200);
	s1.setName("Bala");
	
	//User defined List
	List<Sample>l=new ArrayList<>();
	l.add(s);
	l.add(s1);
	//iteration
	for (int i = 0; i < l.size(); i++) {
		System.out.println(l.get(i).getId());
		System.out.println(l.get(i).getName());
	}
	
}
}
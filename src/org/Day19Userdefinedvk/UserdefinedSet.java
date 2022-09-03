package org.Day19Userdefinedvk;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserdefinedSet {
	public static void main(String[] args) {
		
	Sample s=new Sample();
	s.setId(100);
	s.setName("Devi");
	
	Sample s1=new Sample();
	s1.setId(200);
	s1.setName("Hari");
	
	//user defined set
	Set<Sample>se=new LinkedHashSet<>();
	se.add(s);
	se.add(s1);
	
	for (Sample sample : se) {
		System.out.println(sample.getId());
		System.out.println(sample.getName());
	}
	
}
}
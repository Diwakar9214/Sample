package org.Day17task;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
	public static void main(String[] args) {
		Set<Integer>s=new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(90);
		s.add(10);
		s.add(10);
		s.add(40);
		s.add(50);
		System.out.println(s);
		Set<Integer>s1=new HashSet<>();
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(80);
		System.out.println(s1);
		s.removeAll(s);
		System.out.println(s);
		
	}

}

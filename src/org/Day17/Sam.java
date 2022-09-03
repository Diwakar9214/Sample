package org.Day17;

import java.util.HashSet;
import java.util.Set;

public class Sam {
	public static void main(String[] args) {
		Set<Integer>s=new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(10);
		s.add(20);
		System.out.println(s);
		int size=s.size();
		System.out.println("Size of set "+size);
		for (Integer integer : s) {
			System.out.println(integer);
		}
		boolean remove=s.remove(40);
		System.out.println(remove);
		System.out.println(s);
	}
}

package org.Day17task;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
	public static void main(String[] args) {
		Set<Integer>s=new TreeSet<>();
		s.add(105);
		s.add(205);
		s.add(305);
		s.add(405);
		s.add(505);
		s.add(605);
		s.add(705);
		s.add(805);
		System.out.println("Treeset class");
		for (Integer integer : s) {
			System.out.println(integer);
		}
		Set<Integer>s1=new HashSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(70);
		s1.add(80);
		s1.add(90);
		s1.add(10);
		s1.add(20);
		System.out.println("HashSet class");
		for (Integer integer : s1) {
			System.out.println(integer);
		}
		Set<Integer>s2=new LinkedHashSet<>();
		s2.add(10);
		s2.add(20);
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(70);
		s2.add(80);
		s2.add(90);
		s2.add(10);
		s2.add(20);
		System.out.println("LinkedHashSet class");
		for (Integer integer : s2) {
			System.out.println(integer);
		}
	}
}

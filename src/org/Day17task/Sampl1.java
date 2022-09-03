package org.Day17task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sampl1 {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println(l);
		Set<Integer>s=new HashSet<>();
		s.addAll(l);
		System.out.println(s);
		List<Integer>l1=new ArrayList<>();
		l1.add(105);
		l1.add(205);
		l1.add(305);
		l1.add(405);
		l1.add(505);
		l1.add(605);
		l1.add(705);
		l1.add(805);
		l1.add(505);
		l1.add(605);
		System.out.println(l1);		
		Set<Integer>s1=new LinkedHashSet<>();
		s1.addAll(l1);
		System.out.println(s1);
		List<Integer>l2=new ArrayList<>();
		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(400);
		l2.add(500);
		l2.add(600);
		l2.add(700);
		l2.add(100);
		l2.add(300);
		l2.add(500);
		System.out.println(l2);
		Set<Integer>s2=new TreeSet<>();
		s2.addAll(l2);
		System.out.println(s2);
		
	}
}

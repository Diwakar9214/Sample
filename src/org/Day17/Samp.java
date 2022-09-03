package org.Day17;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Samp {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(10);
		l.add(20);
		System.out.println(l);
		System.out.println("List size "+l.size());
		Set<Integer>s=new LinkedHashSet<>();
		boolean add=s.addAll(l);
		System.out.println(s);
		System.out.println("Size of set "+s.size());
		System.out.println("Count of duplicates "+((l.size()-(s.size()))));
	}

}

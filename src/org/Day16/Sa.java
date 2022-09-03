package org.Day16;

import java.util.ArrayList;
import java.util.List;

public class Sa {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(10);
		
		System.out.println(l);
		Integer remove=l.remove(2);
		System.out.println(remove);
		System.out.println(l);
		
		List<Integer>li=new ArrayList<>();
		boolean addAll=li.addAll(l);
		System.out.println(addAll);
		System.out.println(li);
	}
}

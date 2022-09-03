package org.Day16task.test;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		List <Integer>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println(l);
		int size=l.size();
		System.out.println("Length of List "+size);
		
		
	}
}

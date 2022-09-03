package org.Day16;

import java.util.ArrayList;
import java.util.List;

public class Sampl1 {

	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		
		System.out.println(l.get(2));
		int size=l.size();
		System.out.println("Size of list "+size);
		
	}
}

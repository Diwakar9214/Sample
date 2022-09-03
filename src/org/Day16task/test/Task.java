package org.Day16task.test;

import java.util.ArrayList;
import java.util.List;

public class Task {
	public static void main(String[] args) {
		//Task1
		List<Integer>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		int indexof=l.indexOf(10);
		System.out.println(indexof);
		//Task2
				List<Integer>li=new ArrayList<>();
				li.add(10);
				li.add(20);
				li.add(30);
				li.add(90);
				li.add(10);
				li.add(10);
				li.add(40);
				li.add(50);
				System.out.println(li);
				int lastindexof=li.lastIndexOf(10);
				System.out.println(lastindexof);
				int index=li.indexOf(50);
				System.out.println(index);
				int index1=li.indexOf(90);
				System.out.println(index1);
				int index2=li.indexOf(10);
				System.out.println(index2);
				
				
				
				
				
				
		
	}

}

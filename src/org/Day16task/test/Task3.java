package org.Day16task.test;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
	public static void main(String[] args) {
		List <Integer>l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		//Remove the value present at 2nd index
		System.out.println(l);
		System.out.println(l.remove(2));
		System.out.println(l);
		List <Integer>l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		System.out.println(l1);
		//Remove the value present at 10th index 
		//l1.remove(10);
		//Remove the last value of 10 present in the list 
		int lastindexof=l1.lastIndexOf(10);
		int remove=l1.remove(lastindexof);
		System.out.println(lastindexof);
		System.out.println(remove);
		System.out.println(l1);
		
	}
}

package org.Day16task.test;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
	public static void main(String[] args) {
		//Get the value present at 2nd index
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println(l);
		System.out.println(l.get(2));
		//Get the value present at 4nd index
		List<Integer> l1=new ArrayList<>();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(500);
		l1.add(600);
		System.out.println(l1);
		System.out.println(l1.get(4));
		//Get the value present at 8 index
		List<Integer> l2=new ArrayList<>();
		l2.add(105);
		l2.add(205);
		l2.add(305);
		l2.add(405);
		l2.add(505);
		l2.add(605);
		l2.add(705);
		l2.add(805);		
		System.out.println(l2);
		System.out.println(l2.get(7));
		//Get the each value of list by using normal for loop
		System.out.println("Normal for loop");
		for (int i = 0; i < l2.size(); i++) {			
			System.out.println(l2.get(i));			
		}System.out.println("Enhanced for loop");
		for (Integer integer : l2) {
			System.out.println(integer);
			
		}
		
		
	}

}

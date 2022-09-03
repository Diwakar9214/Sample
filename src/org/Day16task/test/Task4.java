package org.Day16task.test;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
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
		l.add(2,50);
		System.out.println(l);
		l.add(70);
		System.out.println(l);
		l.add(8,80);
		System.out.println(l);
		l.add(10,100);
		System.out.println(l);
		List<Integer>l1=new ArrayList<>();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(500);
		l1.add(600);
		l1.add(700);
		System.out.println(l1);
		l1.set(2,350);
		System.out.println(l1);
		l1.set(6,90);
		System.out.println(l1);
		
		
		
		
		
		}
}

package org.Day16;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {
		public static void main(String[] args) {
			List<Integer>l=new ArrayList<>();
			l.add(10);
			l.add(20);
			l.add(30);
			l.add(40);
			l.add(50);
			l.add(10);
			System.out.println(l);
			l.add(2,100);
			System.out.println(l);
			l.set(4,200);
			System.out.println(l);
			boolean empty=l.isEmpty();
			System.out.println(empty);
			boolean contain=l.contains(100);
			System.out.println(contain);
			int indexof=l.indexOf(100);
			System.out.println(indexof);
			int lastindexof=l.lastIndexOf(10);
			System.out.println(lastindexof);
			
		}
}

package org.Day20Exception;

import java.util.ArrayList;
import java.util.List;

public class IndexException {
	public static void main(String[] args) {
		
	
	//Index out of bound exception
	List<Integer> l=new ArrayList<>();
	l.add(10);//0
	l.add(20);//1
	l.add(30);//2
	l.add(40);//3
	l.add(50);//4
	System.out.println(l.get(6));
}
}
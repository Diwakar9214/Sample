package org.Day14;

import java.util.Iterator;

public class Samp {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=50;
		a[3]=30;
		a[4]=40;
		System.out.println(a[2]);
		System.out.println("Using normal for loop");
		for (int i = 1; i < 4; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("Using enhanced for loop");
		for (int i : a) {
			System.out.println(i);
			
		}
		
	}

}

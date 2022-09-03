package org.Day14;

public class Sam {
	public static void main(String[] args) {
		int a[]= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		float sum = 0,avg=0;
		
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			
		}
		avg=sum/a.length;
		System.out.println("Average of array is "+avg);
	}

}

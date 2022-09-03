package org.Day22File;

import java.io.File;

public class Sample1 {
	public static void main(String[] args) {
		//create a new folder within another folder
		File src=new File("C:\\Users\\Dhani\\Desktop\\Diwa\\online\\Java\\File1\\oops");
		boolean mkdirs = src.mkdirs();
		System.out.println(mkdirs);
	}

}

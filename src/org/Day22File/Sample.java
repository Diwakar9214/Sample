package org.Day22File;

import java.io.File;

public class Sample {
	public static void main(String[] args) {
		//create a new folder
		
		File f=new File("C:\\Users\\Dhani\\Desktop\\Diwa\\online\\Java\\File1");
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
	}
}

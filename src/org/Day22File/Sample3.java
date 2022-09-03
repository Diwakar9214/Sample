package org.Day22File;

import java.io.File;
import java.io.IOException;

public class Sample3 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Dhani\\Desktop\\Diwa\\online\\Java\\File1\\oops\\inheritance.txt");
		boolean file = f.isFile();
		System.out.println(file);
		//check whether given location is directory or not
		boolean directory = f.isDirectory();
		System.out.println(directory);
	}

}

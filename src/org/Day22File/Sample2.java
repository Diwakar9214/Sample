package org.Day22File;

import java.io.File;
import java.io.IOException;

public class Sample2 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Dhani\\Desktop\\Diwa\\online\\Java\\File1\\oops\\inheritance.txt");
		boolean b = f.createNewFile();
		System.out.println(b);
		//check whether file can read or not
		boolean canRead = f.canRead();
		System.out.println(canRead);
		//check whether file can write or not
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		//check whether file cane be execute or not
		boolean canExecute = f.canExecute();
		System.out.println(canExecute);
	}

}

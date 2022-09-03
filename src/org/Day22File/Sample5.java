package org.Day22File;

import java.io.File;
import java.io.IOException;

public class Sample5 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Dhani\\Desktop");
		//List all file in given folder
		String[] s = f.list();
		for(String s1:s) {
			System.out.println(s1);
		}
	}

}

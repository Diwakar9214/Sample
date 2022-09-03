package org.Day22File;

import java.io.File;
import java.io.IOException;

public class Sample4 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Dhani\\Desktop");
		//List all file in given folder
		File[] listFiles = f.listFiles();
		for(File listFile:listFiles) {
			System.out.println(listFile);
		}
	}

}

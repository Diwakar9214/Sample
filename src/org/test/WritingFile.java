package org.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\filewriting\\myTexfile.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter writer=new BufferedWriter(fw);
		
	
	}

}

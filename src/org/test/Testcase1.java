package org.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testcase1 {
	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Dhani\\eclipse-workspace\\Java2\\src\\org\\file1\\object.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("Name"));
	}

}

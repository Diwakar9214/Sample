package org.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testcase2 {
	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\org\\file1\\object.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("course"));
		System.out.println(System.getProperty("user.dir"));
	}

}

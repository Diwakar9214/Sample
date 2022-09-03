package org.Day20ExceptionHandlingUsingcheckedType;

import java.io.File;
import java.io.IOException;

public class IOExceptionHandling {
	public static void main(String[] args) throws IOException  {
		
		File f=new File("");
		f.createNewFile();
	}
}

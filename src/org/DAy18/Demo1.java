package org.DAy18;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo1 {
	public static void main(String[] args) {
		Map<Integer,String>m=new LinkedHashMap<>();
		m.put(10,"Java");
		m.put(20,"Selenium");
		m.put(30,"Mobile");
		m.put(40,"Appium");
		m.put(10,"MObile");
		m.put(20, "Appium");
		System.out.println(m);
	}

}

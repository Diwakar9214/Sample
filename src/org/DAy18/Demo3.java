package org.DAy18;

import java.util.Map;
import java.util.TreeMap;

public class Demo3 {
	public static void main(String[] args) {
		Map<Integer,String>m=new TreeMap<>();
		m.put(10, "Java");
		m.put(20, null);
		m.put(30, "appium");
		m.put(40, null);
		System.out.println(m);
	}

}

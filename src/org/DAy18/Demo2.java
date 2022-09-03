package org.DAy18;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo2 {
	public static void main(String[] args) {
		Map<Integer,String>m=new LinkedHashMap<>();
		m.put(10,"Java");
		m.put(20,"Selenium");
		m.put(30,"Appium");
		m.put(40,"Mobile");
		
		System.out.println(m);
		String string=m.get(40);
		System.out.println(string);
		
		Collection<String>values=m.values();
		System.out.println(values);
		
		for (String string2 : values) {
			System.out.println(string2);
		}
		Set<Integer>keyset=m.keySet();
		System.out.println(keyset);
		
		for (Integer integer : keyset) {
			System.out.println(integer);
		}
		Set<Entry<Integer,String>>entryset=m.entrySet();
		System.out.println(entryset);
		
		for (Entry<Integer, String> entry : entryset) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	
}

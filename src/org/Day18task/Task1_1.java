package org.Day18task;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task1_1 
{
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(10 ,"java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "Sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10 ,"selenium");
		m.put(50, "psql");
		m.put(40, "Hadoop");
		
		System.out.println(m);
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}

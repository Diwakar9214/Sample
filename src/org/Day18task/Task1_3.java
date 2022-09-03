package org.Day18task;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task1_3 {
	public static void main(String[] args) {
		Map<String,Integer>m=new TreeMap<>();
		m.put("!", 10);
		m.put("@", 20);
		m.put("#", 30);
		m.put("$", 40);
		m.put("%", 50);
		m.put("^", 60);
		m.put("&", 10);
		m.put("*", 50);
		m.put("(", 40);
		System.out.println(m);
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		Collection<Integer> values = m.values();
		System.out.println(values);
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		System.out.println(entrySet);
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}

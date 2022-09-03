package org.Day18task;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task1_4 {
	public static void main(String[] args) {
		Map<String,String>m=new Hashtable<>();
		m.put("vel","Selenium" );
		m.put("Ganesh","framework" );
		m.put("Dinesh","oracle" );
		m.put("Vengat","corejava" );
		m.put("subash","jira" );
		System.out.println(m);
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		Collection<String> values = m.values();
		System.out.println(values);
		Set<Entry<String, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}

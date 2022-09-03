package org.Day19Userdefinedvk;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinedMap {
	public static void main(String[] args) {
		Sample s=new Sample();
		s.setId(100);
		s.setName("Dinesh");
		
		Sample s1=new Sample();
		s1.setId(200);
		s1.setName("Danny");
		
		//User Defined Map
		Map<Integer,Sample>m=new LinkedHashMap<>();
		m.put(10, s);
		m.put(20, s1);
		Set<Entry<Integer, Sample>> entrySet = m.entrySet();
		for (Entry<Integer, Sample> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getId());
			System.out.println(entry.getValue().getName());
			
		}
		
	}

}

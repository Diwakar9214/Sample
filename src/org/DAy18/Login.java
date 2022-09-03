package org.DAy18;

import java.util.LinkedHashMap;
import java.util.Map;

public class Login {
	public static void main(String[] args) {
		Map<Integer,String>mp=new LinkedHashMap<Integer,String>();
		mp.put(30, "Sql");
		mp.put(10, "Java");
		mp.put(20, "Sql");
		mp.put(10, "Selenium");//Last key is taken when key duplicate
		mp.put(50, "Python");
		mp.put(40, "oracle");
		System.out.println(mp);
		int size = mp.size();
		System.out.println(size);
		boolean containsKey = mp.containsKey(30);
		System.out.println(containsKey);
		boolean containsValue = mp.containsValue("Java");
		System.out.println(containsValue);
		
	}

}

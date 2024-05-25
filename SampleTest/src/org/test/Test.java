package org.test;

import java.util.*;

//Map<Integer,String>
//AuditMap
//map.put(1,"Hello1");
//map.put(1,"Hello2");
//map.put(1,"Hello3");
//map.get(1);
//Hello3
//Hello2
//Hello1

public class Test {
	public static final int size = 10000;
	static ArrayList<String>[] arr = new ArrayList[size];
	
	public static void initiliase() {
		for(int i=0; i<size; i++) {
			arr[i] = new ArrayList<String>();
		}
	}
	
	public static void addElement(int key, String val) {
		if(key >= size) {
			System.out.println("insertion of this key is not possible");
			return;
		}
		arr[key].add(val);
	}
	
	public static List<String> getValues(int key) {
		List<String> values = arr[key];
		return values;
	}
	
	public static String getRecentValue(int key) {
		List<String> values = arr[key];
		return values.get(values.size()-1);
	}
	
	public static void main(String[] args) {
		
		initiliase();
		Map<Integer, String> hmap = new HashMap<>();
		int key = 1;
		String val1 = "Hello1";
		String val2 = "Hello2";
		String val3 = "Hello3";
		String val4 = "Hello4";
		
		addElement(key, val1);
		addElement(key, val2);
		addElement(key, val3);
		addElement(key, val4);
		
		List<String> values = getValues(key);
		System.out.println("values for key: " + key + " : values: " + values);
		System.out.println(getRecentValue(key));
		
	}
}

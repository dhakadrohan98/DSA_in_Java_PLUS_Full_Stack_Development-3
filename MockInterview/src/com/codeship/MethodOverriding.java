package com.codeship;

import java.util.*;

public class MethodOverriding extends Main {

	public void run() {
		System.out.println("Main method run from MethodOverriding class");
	}
	
	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.run();
		
		//converting map into list
		Map<String,Integer> name = new HashMap<>();
		List list = new ArrayList();
		
		name.put("rohan", 80);
		name.put("pranav", 40);
		
		for(String str: name.keySet()) {
			list.add(str);
		}
		
		for(Integer num: name.values()) {
			list.add(num);
		}
		
		System.out.println(list);
		
		
		
	}

}

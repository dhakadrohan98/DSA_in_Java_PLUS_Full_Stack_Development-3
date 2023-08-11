package com.collection.framework;

import java.util.Stack;

public class StackUsingList {

	public static void main(String[] args) {
		Stack<String> animals = new Stack<String>();
		animals.push("Lion");
		animals.push("Bear");
		animals.push("Fox");
		animals.push("Horse");
		System.out.println(animals);
//		System.out.println(animals.peek());
		animals.peek();
		animals.pop();
		System.out.println("second pop element: "+animals.pop());
		
		for(String temp:animals) {
			System.out.println("foreach: "+temp); 
		}

	}

}

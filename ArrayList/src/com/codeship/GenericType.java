package com.codeship;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Without Generics, we can store any type of objects.

public class GenericType {

	public static void main(String[] args) {
		ArrayList templist = new ArrayList();
		templist.add(1);
		templist.add("Rohan");
		templist.add(62353.65);
		
//		Iterator it = templist.iterator();
//		
//		if(it.hasNext()) {
//			System.out.println(it.next());
//		}
		System.out.println("List: "+templist);

	}

}

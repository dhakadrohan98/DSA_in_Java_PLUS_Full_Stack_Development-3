package org.codeship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data {
	private String name;
 
	public Data(String name) {
		super();
		this.name = name;
	}
 
	public String getName() {
		return name;
	}
 
	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
 
}
 
public class App3 {
 
	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		list.add(new Data("Chaand"));
		list.add(new Data("Ed"));
		list.add(new Data("Angelica"));
		list.add(new Data("Maqbul"));
		list.add(new Data("John"));
 
		Collections.sort(list, new Comparator<Data>() {
 
			@Override
			public int compare(Data o1, Data o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
 
		for (Data data : list) {
			System.out.println(data.getName());
		}
 
	}
}


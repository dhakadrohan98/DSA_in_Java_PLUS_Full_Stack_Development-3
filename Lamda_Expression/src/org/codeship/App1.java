package org.codeship;
import java.util.*;

class Data{
	private String name;
 
	public Data(String name) {
		super();
		this.name = name;
	}
 
	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
 
	public String getName() {
		return name;
	}
	
}
 
public class App1 {
 
	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		list.add(new Data("Chaand"));
		list.add(new Data("John"));
		list.add(new Data("Mia"));
		list.add(new Data("Angelica"));
		list.add(new Data("Roy"));
	
	    list.forEach(temp->{
	    	
	    	System.out.println(temp.getName());
	    });
		
		
		
	}
 
}

package org.codeship;

public class Main {

	public static void main(String[] args) {
		Database db=null;
		
		Database object = db.getInstance();
		System.out.println(object);
		
		object.getConnection();	
		Database object1 = db.getInstance();
		System.out.println(object1);
		
		object1.getConnection();
		
	}
}

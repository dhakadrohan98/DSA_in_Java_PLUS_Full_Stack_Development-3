package org.codeship;

public class Main {

	public static void main(String[] args) {
		Database db=null;
		
		Database object1 = db.getInstance();
		System.out.println(object1);
		
		object1.getConnection();	
		Database object2 = db.getInstance();
		System.out.println(object2);
		
		object1.getConnection();
		
	}
}

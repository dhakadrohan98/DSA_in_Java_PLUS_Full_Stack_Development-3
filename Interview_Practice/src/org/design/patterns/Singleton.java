package org.design.patterns;

public class Singleton {

	public static void main(String[] args) {

		Database database=null;
		
		Database singleObject1 = database.getInstance();
		System.out.println(singleObject1);
		
		Database singleObject2 = database.getInstance();
		System.out.println(singleObject2);

	}

}

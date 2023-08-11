package org.codeship;

public class App2 {
	 
	public static void main(String[] args) {
		
	    new Thread(()->{			
			System.out.println("I am inside thread 1");
	           }).start();;
 
	}
}

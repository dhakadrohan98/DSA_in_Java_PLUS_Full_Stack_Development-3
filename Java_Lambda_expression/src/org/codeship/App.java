package org.codeship;

interface Lambda{
	public void demo(); 
}
 
public class App {
 
	public static void main(String[] args) {
		
		Lambda lambda = ()->
			System.out.println("Statement 1");
			
		lambda.demo();	
		
	}
}

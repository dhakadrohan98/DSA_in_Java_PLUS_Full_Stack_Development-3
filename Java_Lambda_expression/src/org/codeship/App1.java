package org.codeship;
 
public class App1 {
 
	public static void main(String[] args) {
		
		Lambda lambda = ()->{
			System.out.println("Statement 1");
			System.out.println("Statement 2");
		};
		lambda.demo();
		
	}
}

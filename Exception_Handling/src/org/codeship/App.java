package org.codeship;

public class App {

	public static void main(String[] args) {
		App obj = new App();
		obj.case2(8, 0);

	}
	
	public void case1(int x, int y) {
		if(y!=0) {
			System.out.println(x / y);
		}
		else {
			System.out.println("The value of y is 0, CASE:1");
		}
	}
	
	public void case2(int x, int y) {
		try {
			System.out.println(x / y);
		}
		catch(Exception e) {
			System.out.println("The value of y is 0, CASE:2");
		}
		
	}

}

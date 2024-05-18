package com.Polymorphism;

public class CompileTimePolymorphism {
	
	public static class Calculation {
		int temp;
		
		public Calculation() {
			super();
		}

		public int sum(int a, int b) {
			return a+b;
		}
		
		public float sum(float a, float b) {
			return a+b;
		}
	}
	
	public static void main(String[] args) {
		Calculation obj = new Calculation();
		System.out.println(obj.sum(1, 5));
		System.out.println(obj.sum(1.3f, 5.6f));
		
		
	}
}	

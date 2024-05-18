package com.Polymorphism;

import com.Polymorphism.CompileTimePolymorphism.Calculation;

public class CompileTimePolymorphismOuterObjectConcept {
	public class Calculation {

		public Calculation() {}

		public int sum(int a, int b) {
			return a + b;
		}

		public float sum(float a, float b) {
			return a + b;
		}
	}

	public static void main(String[] args) {
		CompileTimePolymorphismOuterObjectConcept outerObj = new CompileTimePolymorphismOuterObjectConcept();
		Calculation obj = outerObj.new Calculation();
		System.out.println(obj.sum(1, 5));
		System.out.println(obj.sum(1.3f, 5.6f));

	}
}

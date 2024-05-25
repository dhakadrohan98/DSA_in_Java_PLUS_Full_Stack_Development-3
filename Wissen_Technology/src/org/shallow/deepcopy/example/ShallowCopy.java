package org.shallow.deepcopy.example;

class Pen {
	int x = 30;
}

public class ShallowCopy {

	public static void main(String[] args) {
		Pen obj1 = new Pen();
		Pen obj2 = obj1;

		obj2.x = 98;
		System.out.println("obj1 price: " + obj1.x);
		System.out.println("obj1 price: " + obj2.x);

	}

}

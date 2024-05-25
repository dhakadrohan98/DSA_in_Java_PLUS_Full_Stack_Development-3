package org.shallow.deepcopy.example;

class PenCost {
	int price = 7;
}
public class DeepCopy {

	public static void main(String[] args) {
		PenCost obj1 = new PenCost();
		PenCost obj2 = new PenCost();
		
		obj2.price = 9;
		System.out.println("obj1 price: " + obj1.price);
		System.out.println("obj2 price: " + obj2.price);

	}

}

package com.Polymorphism;

class Polygon {

	// method to render a shape
	public void render() {
		System.out.println("Rendering Polygon...");
	}
}

class Square extends Polygon {
	// renders Square
	public void render() {
		System.out.println("Rendering Square...");
	}
}

class Circle extends Polygon {
	// renders circle
	public void render() {
		System.out.println("Rendering Circle...");
	}
}

//render() method is polymorphic
public class RuntimePolymorphismPolygon {
	public static void main(String[] args) {
		// create an object of Square
		Polygon p1 = new Square();
		p1.render();

		// create an object of Circle
		Polygon p2 = new Circle();
		p2.render();
	}
}

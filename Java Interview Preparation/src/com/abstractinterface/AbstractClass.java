package com.abstractinterface;

//Abstraction can be achieved through Interface
abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Rectangle is drawn");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle is drawn");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		Shape rec = new Rectangle();
		Shape cir = new Circle();
		rec.draw();
		cir.draw();
	}
}

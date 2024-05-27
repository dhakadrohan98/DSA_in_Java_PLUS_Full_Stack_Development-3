package org.oops;

class Parent {
    public Parent() {
        System.out.println("parent constructor");
    }
}

class Child extends Parent {

	public Child() {
		System.out.println("child constructor");
	}
    
}

public class ParentChildRelation {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println("Main method");
	}
}

package com.lamda;

//Functional interface with a single method
interface MyInterface {
 String myMethod(String s);
}

public class LambdaExample {
	public static void main(String[] args) {
        // Using anonymous class
        MyInterface anonymous = new MyInterface() {
            @Override
            public String myMethod(String s) {
                return s+ "Anonymous class";
            }
        };
        anonymous.myMethod("Hello from anonymous object");

        // Using lambda expression
        MyInterface lambda = (s) -> {
        	s = "Is it coming from lambda expression, " + s;
        	return s;
        };
        
        String str = lambda.myMethod("Hello from lambda");
        System.out.println(str);
    }
}

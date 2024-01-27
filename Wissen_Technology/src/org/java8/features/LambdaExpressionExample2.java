package org.java8.features;

@FunctionalInterface  //It is optional  
interface Drawable{  
    public double drawAreaOfCircle(double d);  
}  
  
public class LambdaExpressionExample2 {  
    public static void main(String[] args) {  
        //with lambda  
        Drawable drawable=(r) -> {  
            double result = 3.1412 * r * r;
            return result;
        };  
        System.out.println(drawable.drawAreaOfCircle(2));  
    }  
}  

